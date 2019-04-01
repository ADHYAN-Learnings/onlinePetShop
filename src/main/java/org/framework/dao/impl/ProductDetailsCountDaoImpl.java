/** @Author AdityaPandey
 *  5 Jun 2018
 */
package org.framework.dao.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.framework.beans.ProductDetailsCountBean;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.Pet;
import org.framework.entity.User;
import org.springframework.stereotype.Repository;

@Repository("productDetailsCount")
public class ProductDetailsCountDaoImpl extends HibernateDao<ProductDetailsCountBean> implements DaoActions<ProductDetailsCountBean> {

	@Override
	public ProductDetailsCountBean add(ProductDetailsCountBean obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean update(ProductDetailsCountBean obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean remove(ProductDetailsCountBean obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean get(ProductDetailsCountBean obj) {
		if(logger.isDebugEnabled()) {
			logger.debug("::ProductDetailsCountDaoImpl:::get-"+obj.toString());
		}
		try {
			String status = "";
			
			// step 1: Total # of animal count
			status ="NotSold";
			Long totalNotSoldAnimals =getTotalAnimalCount(obj,status);
			
			//Step 2: Total # user
			Long TotalUserCount = getTotalUserCount(obj);
			
			//Step 3: Total sold Animals
			status ="Sold";
			Long totalSoldAnimals = getTotalAnimalCount(obj,status);
			
			obj.setTotalNotSoldAnimals(totalNotSoldAnimals);
			obj.setTotalUser(TotalUserCount);
			obj.setTotalSoldAnimals(totalSoldAnimals);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	private Long getTotalAnimalCount(ProductDetailsCountBean obj,String status) {
		CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
		CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
		Long totalCount;
		Root<Pet> pet = query.from(Pet.class);	
		query.multiselect(criteriaBuilder.count(pet.get("id"))).where(criteriaBuilder.equal(pet.get("status"), status));
		
		totalCount = currentSession().createQuery(query).getSingleResult();
		return totalCount;
		
	}
	
	private Long getTotalUserCount(ProductDetailsCountBean obj) {
		CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
		CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
		Long totalCount;
		Root<User> user = query.from(User.class);	
		query.multiselect(criteriaBuilder.count(user.get("userId"))).where(criteriaBuilder.equal(user.get("roleType"), "ROLE_USER"));
		
		totalCount = currentSession().createQuery(query).getSingleResult();
		return totalCount;
	}
	@Override
	public ProductDetailsCountBean getAll(ProductDetailsCountBean obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
