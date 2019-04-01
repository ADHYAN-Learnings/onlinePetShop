/** @Author AdityaPandey
 *  5 Jun 2018
 */
package org.framework.beans;

public class ProductDetailsCountBean {
	
	private Long totalNotSoldAnimals;
	private Long totalSoldAnimals;
	private Long totalUser;
	private Long totalUserTransactionDetails;
	public Long getTotalNotSoldAnimals() {
		return totalNotSoldAnimals;
	}
	public void setTotalNotSoldAnimals(Long totalNotSoldAnimals) {
		this.totalNotSoldAnimals = totalNotSoldAnimals;
	}
	public Long getTotalSoldAnimals() {
		return totalSoldAnimals;
	}
	public void setTotalSoldAnimals(Long totalSoldAnimals) {
		this.totalSoldAnimals = totalSoldAnimals;
	}
	public Long getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(Long totalUser) {
		this.totalUser = totalUser;
	}
	public Long getTotalUserTransactionDetails() {
		return totalUserTransactionDetails;
	}
	public void setTotalUserTransactionDetails(Long totalUserTransactionDetails) {
		this.totalUserTransactionDetails = totalUserTransactionDetails;
	}
	@Override
	public String toString() {
		return "ProductDetailsCountBean [totalNotSoldAnimals=" + totalNotSoldAnimals + ", totalSoldAnimals="
				+ totalSoldAnimals + ", totalUser=" + totalUser + ", totalUserTransactionDetails="
				+ totalUserTransactionDetails + "]";
	}
}
