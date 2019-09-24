package org.freeciv.admin.persistence.hibernateconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// TODO: Auto-generated Javadoc
/**
 * The Class HibernateConfiguration.
 *
 * @author anup
 */
@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	/** The driver. */
	@Value("${db.driver}")
	private String DRIVER;

	/** The password. */
	@Value("${db.password}")
	private String PASSWORD;

	/** The url. */
	@Value("${db.url}")
	private String URL;

	/** The username. */
	@Value("${db.username}")
	private String USERNAME;

	/** The dialect. */
	@Value("${hibernate.dialect}")
	private String DIALECT;

	/** The show sql. */
	@Value("${hibernate.show_sql}")
	private String SHOW_SQL;

	/** The hbm2ddl auto. */
	@Value("${hibernate.hbm2ddl.auto}")
	private String HBM2DDL_AUTO;

	/** The packages to scan. */
	@Value("${entitymanager.packagesToScan}")
	private String PACKAGES_TO_SCAN;

	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}

	/**
	 * Session factory.
	 *
	 * @return the local session factory bean
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", DIALECT);
		hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
		hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		sessionFactory.setHibernateProperties(hibernateProperties);

		return sessionFactory;
	}

	/**
	 * Transaction manager.
	 *
	 * @return the hibernate transaction manager
	 */
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}