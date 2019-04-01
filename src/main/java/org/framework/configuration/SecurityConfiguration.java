/** @Author AdityaPandey
 *  13 May 2018
 */
package org.framework.configuration;

import javax.sql.DataSource;

import org.framework.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomSuccessHandler customSuccessHandler;
	
	@Autowired
	AuthenticationService customUserDetailsService;
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder authentication)
			throws Exception { 
		authentication.userDetailsService(customUserDetailsService);
	}
	
	@Bean   
	  public  AbstractRememberMeServices rememberMeServices() {
	      PersistentTokenBasedRememberMeServices rememberMeServices =
	          new PersistentTokenBasedRememberMeServices("AppKey",customUserDetailsService,persistentTokenRepository());
	      rememberMeServices.setAlwaysRemember(true);
	      //rememberMeServices.setTokenLength(1209600);
	      rememberMeServices.setCookieName("remember-me-posc");
	      rememberMeServices.setTokenValiditySeconds(1209600);
	      return rememberMeServices;
	  }
	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
		db.setDataSource(dataSource);
		return db;
	}
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf()
		    .disable()
		    .authorizeRequests()
		    .antMatchers("/user/**")
		    .access("hasRole('ROLE_USER')")
		    .and()
		    .formLogin()
		    .loginPage("/login").successHandler(customSuccessHandler).failureUrl("/admin?error=exist")
		    .loginProcessingUrl("/auth/login_check")
		    .usernameParameter("username").passwordParameter("password")
		    .and()
		    .logout().logoutUrl("/logout")
		    .logoutSuccessUrl("/")
		    .and()
		    .rememberMe()
		    .rememberMeServices(rememberMeServices());
	}


}