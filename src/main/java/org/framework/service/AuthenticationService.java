/** @Author AdityaPandey
 *  15 May 2018
 */
package org.framework.service;

import java.util.Arrays;

import org.framework.beans.LoginBean;
import org.framework.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customUserDetailsService")
public class AuthenticationService implements UserDetailsService  {
 
	@Autowired
	@Qualifier("loginAuthentication")
	private LoginDao<LoginBean> loginAuthentication;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginBean loginBean = loginAuthentication.getUserLoginInfo(username);
		System.out.println(":::"+loginBean.getUsername()+":::::"+loginBean.getPassword()+":::::" +loginBean.getRoleType());
		GrantedAuthority authority = new SimpleGrantedAuthority(loginBean.getRoleType());
		UserDetails userDetails =(UserDetails) new User(loginBean.getUsername(),loginBean.getPassword(),Arrays.asList(authority));
		return userDetails;
	}

}
