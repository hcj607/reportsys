package com.oppein.reportsys.configuration.dbconfig;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.oppein.reportsys.configuration.dbproperties.CrmDatasourceProperties;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;


@Configuration
@DependsOn("transactionManager")
@EnableJpaRepositories(basePackages = "com.oppein.reportsys.repository.crm", entityManagerFactoryRef = "crmEntityManager", transactionManagerRef = "transactionManager")
@EnableConfigurationProperties(CrmDatasourceProperties.class)
public class CrmConfig {

	@Autowired
	private JpaVendorAdapter jpaVendorAdapter;

	@Autowired
	private CrmDatasourceProperties crmDatasourceProperties;

	@Primary
	@Bean(name = "crmDataSource", initMethod = "init", destroyMethod = "close")
	public DataSource crmDataSource() throws SQLException {
		MariaDbDataSource mariaXaDataSource = new MariaDbDataSource();
		mariaXaDataSource.setUrl(crmDatasourceProperties.getUrl());
		mariaXaDataSource.setPassword(crmDatasourceProperties.getPassword());
		mariaXaDataSource.setUser(crmDatasourceProperties.getUsername());
		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();

		xaDataSource.setXaDataSource(mariaXaDataSource);
		xaDataSource.setUniqueResourceName(crmDatasourceProperties.getUniqueResourceName());
		xaDataSource.setBorrowConnectionTimeout(crmDatasourceProperties.getBorrowConnectionTimeout());
		xaDataSource.setMaxPoolSize(crmDatasourceProperties.getMaxPoolSize());
		xaDataSource.setMinPoolSize(crmDatasourceProperties.getMinPoolSize());
		return xaDataSource;

	}

	@Primary
	@Bean(name = "crmEntityManager")
	@DependsOn("transactionManager")
	public LocalContainerEntityManagerFactoryBean customerEntityManager() throws Throwable {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.transaction.jta.platform", AtomikosJtaPlatform.class.getName());
		properties.put("javax.persistence.transactionType", "JTA");

		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setJtaDataSource(crmDataSource());
		entityManager.setJpaVendorAdapter(jpaVendorAdapter);
		entityManager.setPackagesToScan("com.oppein.reportsys.domain.crm");
		entityManager.setPersistenceUnitName("crmPersistenceUnit");
		entityManager.setJpaPropertyMap(properties);
		return entityManager;
	}

}
