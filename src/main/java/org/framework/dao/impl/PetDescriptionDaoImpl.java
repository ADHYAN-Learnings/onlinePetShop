package org.framework.dao.impl;

import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.framework.beans.PetBeans;
import org.framework.beans.PetDescriptionBeans;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.Pet;
import org.framework.entity.PetDescription;
import org.springframework.stereotype.Repository;

@Repository("petDescription")
public class PetDescriptionDaoImpl extends HibernateDao<PetDescriptionBeans> implements DaoActions<PetDescriptionBeans> {

	@Override
	public PetDescriptionBeans add(PetDescriptionBeans obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans update(PetDescriptionBeans obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans remove(PetDescriptionBeans obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans get(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::PetDescriptionDaoImpl::get:::"+obj.toString()+"::obj.getPet().getId()::::"+obj.getDescription_Id());	
		}
		try {
			
		    Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<PetDescription> petDescription = query.from(PetDescription.class);
			Join<PetDescription , Pet>  pet = petDescription.join("pet");
			query.multiselect(petDescription.get("descriptionId"), 
					          pet.get("breed"), 
					          pet.get("imagePath"), 
					          pet.get("price"),
			                  petDescription.get("gender"),
	                          petDescription.get("food"),
	                          petDescription.get("description"),
	                          petDescription.get("medicalCondition"))
					         .where(criteriaBuilder.equal(petDescription.get("descriptionId"), obj.getDescription_Id()));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			
			if(isListExist.test(result)) {
				PetBeans petBeans = null;
				for(Object[] object : result) {
					
					petBeans = new PetBeans();
				    obj.setDescription_Id((int)object[0]);
				    
				    petBeans.setBreed((String)object[1]);
				    petBeans.setImagePath((String)object[2]);
				    petBeans.setPrice((Double)object[3]);
				    
				    /*obj.getPetBeans().setBreed((String)object[1]);
				    obj.getPetBeans().setImagePath((String)object[2]);
				    obj.getPetBeans().setPrice((Double)object[3]);*/
				    obj.setPetBeans(petBeans);
				    
				    obj.setGender((String)object[4]);
				    obj.setFood((String)object[5]);
				    obj.setDescription((String)object[6]);
				    obj.setMedicalCondition((String)object[7]);
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return obj;
	}

	@Override
	public PetDescriptionBeans getAll(PetDescriptionBeans obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
