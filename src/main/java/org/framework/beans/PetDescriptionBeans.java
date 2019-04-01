package org.framework.beans;

public class PetDescriptionBeans extends ResponseBean<PetDescriptionBeans> {

	private int description_Id;
	private String gender = "";
	private String food = "";
	private String description = "";
	private String medicalCondition = "";
	private PetBeans petBeans ;
	private String action = "";
	private boolean loginExist = true;
	
	public int getDescription_Id() {
		return description_Id;
	}
	public void setDescription_Id(int description_Id) {
		this.description_Id = description_Id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public PetBeans getPetBeans() {
		return petBeans;
	}
	public void setPetBeans(PetBeans petBeans) {
		this.petBeans = petBeans;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public boolean isLoginExist() {
		return loginExist;
	}
	public void setLoginExist(boolean loginExist) {
		this.loginExist = loginExist;
	}

}
