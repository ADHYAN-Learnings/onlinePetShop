/** @Author AdityaPandey
 *  5 May 2018
 */
package org.framework.dao.impl;

import org.framework.beans.UserDetailsBean;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.User;
import org.springframework.stereotype.Repository;

@Repository("newUserDetails")
public class NewUserDetailsDaoImpl extends HibernateDao<UserDetailsBean> implements DaoActions<UserDetailsBean> {

	@Override
	public UserDetailsBean add(UserDetailsBean obj) {
		if(logger.isDebugEnabled()) {
			  logger.debug(":::UserDetailsBean::::"+obj.toString());
			}
		
        User entity = new User();
		
        entity.setUserName(obj.getUserName());
        entity.setPassword(obj.getPassword());
        entity.setLandMark(obj.getLandMark());
        entity.setPincode(obj.getPincode());
        entity.setDistrict(obj.getDistrict());
        entity.setCity(obj.getCity());
        entity.setState(obj.getState());
        entity.setRoleType("ROLE_USER");
		
		currentSession().save(entity);
		
		
		return  obj; 
	}

	@Override
	public UserDetailsBean update(UserDetailsBean obj) {
		return null;
	}

	@Override
	public UserDetailsBean remove(UserDetailsBean obj) {
		return null;
	}

	@Override
	public UserDetailsBean get(UserDetailsBean obj) {
		return null;
	}

	@Override
	public UserDetailsBean getAll(UserDetailsBean obj) {
		// TODO Auto-generated method stub
		return null;
	}

}

