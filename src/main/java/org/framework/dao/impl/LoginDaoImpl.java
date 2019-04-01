/** @Author AdityaPandey
 *  15 May 2018
 */
package org.framework.dao.impl;

import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.framework.beans.LoginBean;
import org.framework.dao.HibernateDao;
import org.framework.dao.LoginDao;
import org.framework.entity.User;
import org.springframework.stereotype.Repository;

@Repository("loginAuthentication")
public class LoginDaoImpl extends HibernateDao<LoginBean> implements LoginDao<LoginBean> {
	
	@Override
	public LoginBean getUserLoginInfo(String username) {
		if(logger.isDebugEnabled()) {
			logger.debug("::LoginDaoImpl:::getUserLoginInfo:::username--"+username);
		}
		    LoginBean loginBean = new LoginBean();
		 try {
				Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
				  CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
				  CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
				  Root<User> userDetails = query.from(User.class);
				  query.multiselect(userDetails.get("userName"),userDetails.get("password"),userDetails.get("roleType"))
				                    .where(criteriaBuilder.equal(userDetails.get("userName"),username));
				  
				  List<Object[]> result = currentSession().createQuery(query).getResultList();
				  if(isListExist.test(result)) {
					for(Object[] object : result) {
						loginBean.setUsername((String)object[0]);
						loginBean.setPassword((String)object[1]);
						loginBean.setRoleType((String)object[2]);
					}
				  }
			} catch (Exception e) {
				e.printStackTrace();
			}
				return loginBean;
	}

}
