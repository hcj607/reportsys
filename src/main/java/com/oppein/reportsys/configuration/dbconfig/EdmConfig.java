package com.oppein.reportsys.configuration.dbconfig;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.oppein.reportsys.configuration.dbproperties.EdmDatasourceProperties;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;

@Configuration
@DependsOn("transactionManager")
@EnableJpaRepositories(basePackages = "com.oppein.reportsys.repository.edm", entityManagerFactoryRef = "edmEntityManager", transactionManagerRef = "transactionManager")
@EnableConfigurationProperties(EdmDatasourceProperties.class)
public class EdmConfig {

	@Autowired
	private JpaVendorAdapter jpaVendorAdapter;

	@Autowired
	private EdmDatasourceProperties edmDatasourceProperties;

	@Bean(name = "edmDataSource", initMethod = "init", destroyMethod = "close")
	public DataSource edmDataSource() throws SQLException {
		 MariaDbDataSource mariaXaDataSource = new MariaDbDataSource();
		 mariaXaDataSource.setUrl(edmDatasourceProperties.getUrl());
		 mariaXaDataSource.setPassword(edmDatasourceProperties.getPassword());
		 mariaXaDataSource.setUser(edmDatasourceProperties.getUsername());
		 AtomikosDataSourceBean oxaDataSource = new AtomikosDataSourceBean();
		 oxaDataSource.setXaDataSource(mariaXaDataSource);
		 oxaDataSource.setUniqueResourceName(edmDatasourceProperties.getUniqueResourceName());
		 oxaDataSource.setBorrowConnectionTimeout(edmDatasourceProperties.getBorrowConnectionTimeout());
		 oxaDataSource.setMaxPoolSize(edmDatasourceProperties.getMaxPoolSize());
		 oxaDataSource.setMinPoolSize(edmDatasourceProperties.getMinPoolSize());
		 return oxaDataSource;
	}

	@Bean(name = "edmEntityManager")
	public LocalContainerEntityManagerFactoryBean orderEntityManager() throws Throwable {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.transaction.jta.platform", AtomikosJtaPlatform.class.getName());
		properties.put("javax.persistence.transactionType", "JTA");

		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setJtaDataSource(edmDataSource());
		entityManager.setJpaVendorAdapter(jpaVendorAdapter);
		entityManager.setPackagesToScan("com.oppein.reportsys.domain.edm");
		entityManager.setPersistenceUnitName("edmPersistenceUnit");
		entityManager.setJpaPropertyMap(properties);
		return entityManager;
	}

}
