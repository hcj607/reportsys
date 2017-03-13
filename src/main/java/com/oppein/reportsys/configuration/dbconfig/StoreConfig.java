package com.oppein.reportsys.configuration.dbconfig;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.oppein.reportsys.configuration.dbproperties.StoreDatasourceProperties;
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
@EnableJpaRepositories(basePackages = "com.oppein.reportsys.repository.store", entityManagerFactoryRef = "storeEntityManager", transactionManagerRef = "transactionManager")
@EnableConfigurationProperties(StoreDatasourceProperties.class)
public class StoreConfig {

	@Autowired
	private JpaVendorAdapter jpaVendorAdapter;

	@Autowired
	private StoreDatasourceProperties storeDatasourceProperties;

	@Bean(name = "storeDataSource", initMethod = "init", destroyMethod = "close")
	public DataSource storeDataSource() throws SQLException {
		MariaDbDataSource mariaXaDataSource = new MariaDbDataSource();
		mariaXaDataSource.setUrl(storeDatasourceProperties.getUrl());
		mariaXaDataSource.setPassword(storeDatasourceProperties.getPassword());
		mariaXaDataSource.setUser(storeDatasourceProperties.getUsername());
		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();

		xaDataSource.setXaDataSource(mariaXaDataSource);
		xaDataSource.setUniqueResourceName(storeDatasourceProperties.getUniqueResourceName());
		xaDataSource.setBorrowConnectionTimeout(storeDatasourceProperties.getBorrowConnectionTimeout());
		xaDataSource.setMaxPoolSize(storeDatasourceProperties.getMaxPoolSize());
		xaDataSource.setMinPoolSize(storeDatasourceProperties.getMinPoolSize());
		return xaDataSource;

	}


	@Bean(name = "storeEntityManager")
	@DependsOn("transactionManager")
	public LocalContainerEntityManagerFactoryBean customerEntityManager() throws Throwable {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.transaction.jta.platform", AtomikosJtaPlatform.class.getName());
		properties.put("javax.persistence.transactionType", "JTA");

		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setJtaDataSource(storeDataSource());
		entityManager.setJpaVendorAdapter(jpaVendorAdapter);
		entityManager.setPackagesToScan("com.oppein.reportsys.domain.store");
		entityManager.setPersistenceUnitName("crmPersistenceUnit");
		entityManager.setJpaPropertyMap(properties);
		return entityManager;
	}

}
