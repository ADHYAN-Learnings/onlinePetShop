/** @Author AdityaPandey
 *  8 Jun 2018
 */
package org.framework.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.framework.beans.UserDetailsBean;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDetails")
public class AdminUserDetailsDaoImpl extends HibernateDao<UserDetailsBean> implements DaoActions<UserDetailsBean> {

	@Override
	public UserDetailsBean add(UserDetailsBean obj) {
		return null;
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
	  if(logger.isDebugEnabled()) {
		logger.debug(":::AdminUserDetailsDaoImpl::::get::::obj-"+obj.toString()); 	
	  }
	  UserDetailsBean userDetailsBean = null;
	   try {
		    Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<User> user = query.from(User.class);
			query.multiselect(user.get("userId"), 
					          user.get("userName"), 
					          user.get("landMark"), 
					          user.get("pincode"),
			                  user.get("district"),
			                  user.get("city"),
			                  user.get("state"),
			                  user.get("roleType"))
					          .where(criteriaBuilder.equal(user.get("userId"), obj.getUserId()));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			
			if(isListExist.test(result)) {
				for(Object[] object : result) {
					userDetailsBean = new UserDetailsBean();
					
					userDetailsBean.setUserId((int)object[0]);
					userDetailsBean.setUserName((String)object[1]);
					userDetailsBean.setLandMark((String)object[2]);
					userDetailsBean.setPincode((Long)object[3]);
					userDetailsBean.setDistrict((String)object[4]);
					userDetailsBean.setCity((String)object[5]);
					userDetailsBean.setState((String)object[6]);
					userDetailsBean.setRoleType((String)object[7]);
				}
			}
		   
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
		return userDetailsBean;
	}

	@Override
	public UserDetailsBean getAll(UserDetailsBean obj) {
      if(logger.isDebugEnabled()) {
    	  logger.debug("::::AdminUserDetailsDaoImpl:::getAll:::obj-"+obj.toString());
      }
	    try {
			Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<User> user = query.from(User.class);
			query.multiselect(user.get("userId"), 
					          user.get("userName"), 
					          user.get("landMark"), 
					          user.get("pincode"),
			                  user.get("district"),
			                  user.get("city"),
			                  user.get("state"),
			                  user.get("roleType"))
					          .where(criteriaBuilder.equal(user.get("roleType"), "ROLE_USER"));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			
			if(isListExist.test(result)) {
				UserDetailsBean userDetailsBean = null;
				obj.setList(new ArrayList<UserDetailsBean>());
				
				for(Object[] object : result) {
					userDetailsBean = new UserDetailsBean();
					
					userDetailsBean.setUserId((int)object[0]);
					userDetailsBean.setUserName((String)object[1]);
					userDetailsBean.setLandMark((String)object[2]);
					userDetailsBean.setPincode((Long)object[3]);
					userDetailsBean.setDistrict((String)object[4]);
					userDetailsBean.setCity((String)object[5]);
					userDetailsBean.setState((String)object[6]);
					userDetailsBean.setRoleType((String)object[7]);
					obj.getList().add(userDetailsBean);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
