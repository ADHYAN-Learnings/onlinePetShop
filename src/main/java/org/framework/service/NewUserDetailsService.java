/** @Author AdityaPandey
 *  5 May 2018
 */
package org.framework.service;

import org.framework.beans.UserDetailsBean;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NewUserDetailsService  extends AbstractService<UserDetailsBean>{
	

	@Autowired
	@Qualifier("newUserDetails")
	private DaoActions<UserDetailsBean> newUserDetails;

	@Override
	public UserDetailsBean add(Object obj) {
		return newUserDetails.add((UserDetailsBean)obj);
	}

	@Override
	public UserDetailsBean update(Object obj) {
		return null;
	}

	@Override
	public UserDetailsBean remove(Object obj) {
		return null;
	}

	@Override
	public UserDetailsBean getAll(Object obj) {
		return null;
	}

	@Override
	public UserDetailsBean get(Object obj) {
		return null;
	}

}
