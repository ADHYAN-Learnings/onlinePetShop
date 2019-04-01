/** @Author AdityaPandey
 *  9 Jun 2018
 */
package org.framework.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.framework.beans.PetBeans;
import org.framework.beans.PetDescriptionBeans;
import org.framework.dao.DaoActions;
import org.framework.dao.HibernateDao;
import org.framework.entity.Pet;
import org.framework.entity.PetDescription;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Repository("unsoldAnimalsDetail")
public class UnsoldAnimalsDetailsDaoImpl extends HibernateDao<PetDescriptionBeans> implements DaoActions<PetDescriptionBeans> {
	private static final String PROJECT_DIRECTORY = "D:/Aditya_practice_workspace/OnlinePetShop/src/main/webapp";
	private static final String RESOURCE_DIRECTORY = "/resources/core/images/";

	@Override
	public PetDescriptionBeans add(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug("::::UnsoldAnimalsDetailsDaoImpl:::add-"+obj.toString()+"::::::"+obj.getPetBeans().toString());
		}
		try {
		   /*Step 1: Save the image in a folder location */
				UploadImage(obj);
			
		  /*Step 2:Save the Image information in a database */
		  PetDescription petDescriptionEntity = new PetDescription();
		  Pet petEntity = new Pet();
		  
		  petEntity.setBreed(obj.getPetBeans().getBreed());
		  
		  if(obj.getPetBeans().getImagePath() != null) {
			  petEntity.setImagePath(obj.getPetBeans().getImagePath());  
		  }
		  petEntity.setPrice(obj.getPetBeans().getPrice());
		  petEntity.setStatus("NotSold");
		  
		  petDescriptionEntity.setPet(petEntity);
		  petDescriptionEntity.setGender(obj.getGender());
		  petDescriptionEntity.setFood(obj.getFood());
		  petDescriptionEntity.setDescription(obj.getDescription());
		  petDescriptionEntity.setMedicalCondition(obj.getMedicalCondition());
		  
		  currentSession().saveOrUpdate(petDescriptionEntity);
		  
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	@Override
	public PetDescriptionBeans update(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::UnsoldAnimalsDetailsDaoImple:::update:::obj-"+obj.toString()+":::breed::"+obj.getPetBeans().getBreed()+"::ID::"+obj.getPetBeans().getFile());
		}
		try {
			
			 /*Step 1: Save the image in a folder location */
			MultipartFile fileData  = obj.getPetBeans().getFile();
			Boolean fileExist = !fileData.isEmpty(); 
			if(fileExist) {
				UploadImage(obj);
			}
			/*Step 2: Save the pet information in a database */
			updatePetEntityTable(obj,fileExist);
			
			/*Step 3: Save the PetInformation in a database */
			updatePetDescriptionEntity(obj);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	@Override
	public PetDescriptionBeans remove(PetDescriptionBeans obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans get(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::UnsoldAnimalDetailsDaoImpl:::get:::obj-"+obj.toString()+"::::::::"+obj.getPetBeans().getId());
		}
		try {
			Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<PetDescription> petDescription = query.from(PetDescription.class);
			Join<PetDescription , Pet>  pet = petDescription.join("pet");
			query.multiselect(pet.get("id"),
					          pet.get("breed"),
					          pet.get("price"),
					          petDescription.get("gender"),
			                  petDescription.get("food"),
			                  petDescription.get("description"),
			                  petDescription.get("medicalCondition"))
			                  .where(criteriaBuilder.equal(pet.get("id"), obj.getPetBeans().getId()));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			
			if(isListExist.test(result)) {
				PetBeans petBeans = null;
				for(Object[] object : result) {
					petBeans = new PetBeans();
					
					petBeans.setId((Integer)object[0]);
					petBeans.setBreed((String)object[1]);
					petBeans.setPrice((Double)object[2]);
					
					obj.setPetBeans(petBeans);
				    obj.setGender((String)object[3]);
				    obj.setFood((String)object[4]);
				    obj.setDescription((String)object[5]);
				    obj.setMedicalCondition((String)object[6]);
					
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	@Override
	public PetDescriptionBeans getAll(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::UnsoldAnimalDetailsDaoImpl:::getAll:::obj-"+obj.toString());
		}
		try {
			
		    Predicate<List<Object[]>> isListExist = result ->!result.isEmpty();
			CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
			CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
			
			Root<PetDescription> petDescription = query.from(PetDescription.class);
			Join<PetDescription , Pet>  pet = petDescription.join("pet");
			query.multiselect(pet.get("id"),
					          pet.get("breed"),
					          pet.get("price"),
					          pet.get("status"),
					          petDescription.get("gender"))
			                  .where(criteriaBuilder.equal(pet.get("status"), "NotSold"));
			
			List<Object[]> result = currentSession().createQuery(query).getResultList();
			if(isListExist.test(result)) {
				PetDescriptionBeans petDescriptionBeans = null;
				PetBeans petBeans = null;
				obj.setList(new ArrayList<PetDescriptionBeans>());
				
				for(Object[] object : result) {
					petDescriptionBeans = new PetDescriptionBeans();
					petBeans = new PetBeans();
					
					petBeans.setId((Integer)object[0]);
					petBeans.setBreed((String)object[1]);
					petBeans.setPrice((Double)object[2]);
					petBeans.setStatus((String)object[3]);
					
					petDescriptionBeans.setGender((String)object[4]);
					petDescriptionBeans.setPetBeans(petBeans);
					obj.getList().add(petDescriptionBeans);
					
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}
	
	private void UploadImage(PetDescriptionBeans obj) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::UnsoldAnimalDetailsDaoImpl::::UploadImage:::obj-"+obj.getPetBeans().getFile());
		}
		try {
			FileCopyUtils.copy(obj.getPetBeans().getFile().getBytes(), new File(PROJECT_DIRECTORY+RESOURCE_DIRECTORY+obj.getPetBeans().getFile().getOriginalFilename()));
			obj.getPetBeans().setImagePath(RESOURCE_DIRECTORY+obj.getPetBeans().getFile().getOriginalFilename());
		} catch(IOException IOEx) {
			IOEx.printStackTrace();
		}
		
	}
	private void updatePetEntityTable(PetDescriptionBeans obj,Boolean fileExist) {
		
		CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
		CriteriaUpdate<Pet> updateJoinQuery = criteriaBuilder.createCriteriaUpdate(Pet.class);
		Root<Pet> petEntity =  updateJoinQuery.from(Pet.class);
		
		updateJoinQuery.set("breed", obj.getPetBeans().getBreed());
		
		if(fileExist) {
			updateJoinQuery.set("imagePath", obj.getPetBeans().getImagePath());
		}
		
		updateJoinQuery.set("price", obj.getPetBeans().getPrice());
		updateJoinQuery.where(criteriaBuilder.equal(petEntity.get("id"), obj.getPetBeans().getId()));
		
		currentSession().createQuery(updateJoinQuery).executeUpdate();
		
	}
	

	private void updatePetDescriptionEntity(PetDescriptionBeans obj) {
		CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
		CriteriaUpdate<PetDescription> updateQuery = criteriaBuilder.createCriteriaUpdate(PetDescription.class);
		Root<PetDescription> peDesciptiontEntity =  updateQuery.from(PetDescription.class);
		
		updateQuery.set("gender", obj.getGender())
		           .set("food", obj.getFood())
		           .set("description", obj.getDescription())
		           .set("medicalCondition", obj.getMedicalCondition())
		           .where(criteriaBuilder.equal(peDesciptiontEntity.get("descriptionId"), obj.getPetBeans().getId()));
		
		currentSession().createQuery(updateQuery).executeUpdate();
		
	}

}
