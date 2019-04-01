package org.framework.beans;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class PetBeans extends ResponseBean<PetBeans> {
  
	private int id;
	private String breed = "";
	private String imagePath = "";
	private double price;
	private String status = "";
    private String productMessage = "";
    private MultipartFile file;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProductMessage() {
		return productMessage;
	}
	public void setProductMessage(String productMessage) {
		this.productMessage = productMessage;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "PetBeans [id=" + id + ", breed=" + breed + ", imagePath=" + imagePath + ", price=" + price + ", status="
				+ status + ", productMessage=" + productMessage + ", file=" + file + "]";
	}
	
}
