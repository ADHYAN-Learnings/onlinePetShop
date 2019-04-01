/** @Author AdityaPandey
 *  13 May 2018
 */
package org.framework.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"org.framework.configuration"})
public class HibernateConfiguration {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/petShop");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] {"org.framework.entity"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		
		return sessionFactory;
	}
	
	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.format_sql", false);
        
        return properties;
	}
	
	   @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(sessionFactory);
	       return txManager;
	    }
}
