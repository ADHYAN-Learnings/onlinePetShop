/** @Author AdityaPandey
 *  9 Jun 2018
 */
package org.framework.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.framework.beans.PaymentStatusBeans;
import org.framework.beans.PaymentUserMappingBean;
import org.framework.beans.PetBeans;
import org.framework.beans.UserDetailsBean;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.PaymentStatus;
import org.framework.entity.PaymentUserMapping;
import org.framework.entity.Pet;
import org.framework.entity.User;
import org.springframework.stereotype.Repository;

@Repository("paymentTransactionDetail")
public class PaymentTransactionDetailDaoImpl extends HibernateDao<PaymentUserMappingBean> implements DaoActions<PaymentUserMappingBean>{

	@Override
	public PaymentUserMappingBean add(PaymentUserMappingBean obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean update(PaymentUserMappingBean obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean remove(PaymentUserMappingBean obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean get(PaymentUserMappingBean obj) {
		if(logger.isDebugEnabled()) {
			logger.debug("::PaymentTransactionDetailDaoImpl:::get::::obj-"+obj.toString()+":::::::"+obj.getUserDetailsBean().getUserId());
		}
		try {
			Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<PaymentUserMapping> paymentUserMapping = query.from(PaymentUserMapping.class);
			Join<PaymentUserMapping , Pet> pet = paymentUserMapping.join("pet");
			Join<PaymentUserMapping , PaymentStatus> paymentStatus = paymentUserMapping.join("paymentStatus");
			Join<PaymentUserMapping , User> user = paymentUserMapping.join("user");
			query.multiselect(user.get("userId"),
					          user.get("userName"),
					          user.get("pincode"),
					          user.get("district"),
					          user.get("city"),
					          user.get("state"),
					          pet.get("breed"),
					          pet.get("price"),
					          paymentStatus.get("paymentType"),
					          paymentStatus.get("cardHolderName"),
					          paymentStatus.get("accountNumber"),
					          paymentStatus.get("paymentStatus"),
					          user.get("roleType"))
			                  .where(criteriaBuilder.equal(pet.get("status"), "Sold"),
			                		 criteriaBuilder.equal(user.get("userId"), obj.getUserDetailsBean().getUserId()));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
		
			if(isListExist.test(result)) {
				
				/*PaymentUserMappingBean paymentUserMappingBean = null;*/
				PetBeans petBeans = null;
				UserDetailsBean userDetailsBean = null;
				PaymentStatusBeans paymentStatusBeans = null;
				
				/*obj.setList(new ArrayList<PaymentUserMappingBean>());*/
				for(Object[] object : result) {
					
				 /*   paymentUserMappingBean = new PaymentUserMappingBean();*/
				    petBeans = new PetBeans();
				    userDetailsBean = new UserDetailsBean();
				    paymentStatusBeans = new PaymentStatusBeans();
				    
				    userDetailsBean.setUserId((Integer)object[0]);
				    userDetailsBean.setUserName((String)object[1]);
				    userDetailsBean.setPincode((Long)object[2]);
				    userDetailsBean.setDistrict((String)object[3]);
				    userDetailsBean.setCity((String)object[4]);
				    userDetailsBean.setState((String)object[5]);
				    
				    petBeans.setBreed((String)object[6]);
				    petBeans.setPrice((Double)object[7]);
				    
				    paymentStatusBeans.setPaymentType((String)object[8]);
				    paymentStatusBeans.setCardHolderName((String)object[9]);
				    paymentStatusBeans.setAccountNumber((Long)object[10]);
				    paymentStatusBeans.setPaymentStatus((String)object[11]);
				    
				    userDetailsBean.setRoleType((String)object[12]);
				    
					obj.setUserDetailsBean(userDetailsBean);
					obj.setPaymentStatusBean(paymentStatusBeans);
					obj.setPetBean(petBeans);
					
					/*obj.getList().add(paymentUserMappingBean);*/
					
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	@Override
	public PaymentUserMappingBean getAll(PaymentUserMappingBean obj) {
		if(logger.isDebugEnabled()) {
			logger.debug("::PaymentTransactionDetailDaoImpl:::getAll::::obj-"+obj.toString());
		}
		try {
			Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<PaymentUserMapping> paymentUserMapping = query.from(PaymentUserMapping.class);
			Join<PaymentUserMapping , Pet> pet = paymentUserMapping.join("pet");
			Join<PaymentUserMapping , PaymentStatus> paymentStatus = paymentUserMapping.join("paymentStatus");
			Join<PaymentUserMapping , User> user = paymentUserMapping.join("user");
			query.multiselect(user.get("userId"),
					          user.get("userName"),
					          pet.get("breed"),
					          paymentStatus.get("paymentType"),
					          paymentStatus.get("cardHolderName"),
					          paymentStatus.get("accountNumber"),
					          pet.get("price"),
					          paymentStatus.get("paymentStatus"),
					          user.get("roleType"))
			                  .where(criteriaBuilder.equal(pet.get("status"), "Sold"));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
		
			if(isListExist.test(result)) {
				
				PaymentUserMappingBean paymentUserMappingBean = null;
				PetBeans petBeans = null;
				UserDetailsBean userDetailsBean = null;
				PaymentStatusBeans paymentStatusBeans = null;
				
				obj.setList(new ArrayList<PaymentUserMappingBean>());
				for(Object[] object : result) {
					
				    paymentUserMappingBean = new PaymentUserMappingBean();
				    petBeans = new PetBeans();
				    userDetailsBean = new UserDetailsBean();
				    paymentStatusBeans = new PaymentStatusBeans();
				    
				    userDetailsBean.setUserId((Integer)object[0]);
				    userDetailsBean.setUserName((String)object[1]);
				    petBeans.setBreed((String)object[2]);
				    paymentStatusBeans.setPaymentType((String)object[3]);
				    paymentStatusBeans.setCardHolderName((String)object[4]);
				    paymentStatusBeans.setAccountNumber((Long)object[5]);
				    petBeans.setPrice((Double)object[6]);
				    paymentStatusBeans.setPaymentStatus((String)object[7]);
				    userDetailsBean.setRoleType((String)object[8]);
				    
					paymentUserMappingBean.setUserDetailsBean(userDetailsBean);
					paymentUserMappingBean.setPaymentStatusBean(paymentStatusBeans);
					paymentUserMappingBean.setPetBean(petBeans);
					
					obj.getList().add(paymentUserMappingBean);
					
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

}
