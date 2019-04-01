package org.framework.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.framework.beans.PetBeans;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.Pet;
import org.springframework.stereotype.Repository;


@Repository("daoActions")
public class PetDaoImpl extends HibernateDao<PetBeans> implements DaoActions<PetBeans> {

	@Override
	public PetBeans add(PetBeans obj) {
		return null;
	}

	@Override
	public PetBeans update(PetBeans obj) {
		return null;
	}

	@Override
	public PetBeans remove(PetBeans obj) {
		return null;
	}

	@Override
	public PetBeans get(PetBeans obj) {
	    try {
			Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<Pet> pet = query.from(Pet.class);
			query.multiselect(pet.get("id"), 
					          pet.get("breed"), 
					          pet.get("imagePath"), 
					          pet.get("price"))
					          .where(criteriaBuilder.equal(pet.get("status"), "NotSold"));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			
			if(isListExist.test(result)) {
				PetBeans petBeans = null;
				obj.setList(new ArrayList<PetBeans>());
				
				for(Object[] object : result) {
					petBeans = new PetBeans();
					
					petBeans.setId((int)object[0]);
					petBeans.setBreed((String)object[1]);
					petBeans.setImagePath((String)object[2]);
					petBeans.setPrice((double)object[3]);
					obj.getList().add(petBeans);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return obj;
	}

	@Override
	public PetBeans getAll(PetBeans obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
