/** @Author AdityaPandey
 *  8 Jun 2018
 */
package org.framework.service;

import org.framework.beans.UserDetailsBean;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AdminUserDetailsService extends AbstractService<UserDetailsBean> {
	
	@Autowired
	@Qualifier("userDetails")
	private DaoActions<UserDetailsBean> userDetails;

	@Override
	public UserDetailsBean add(Object obj) {
		return null;
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
		return userDetails.getAll((UserDetailsBean)obj);
	}

	@Override
	public UserDetailsBean get(Object obj) {
		return userDetails.get((UserDetailsBean)obj);
	}

}
