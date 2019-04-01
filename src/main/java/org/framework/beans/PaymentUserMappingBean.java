/** @Author AdityaPandey
 *  9 Jun 2018
 */
package org.framework.beans;

public class PaymentUserMappingBean extends ResponseBean<PaymentUserMappingBean> {
  private int id;
  private PaymentStatusBeans paymentStatusBean;
  private PetBeans petBean;
  private UserDetailsBean userDetailsBean;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PaymentStatusBeans getPaymentStatusBean() {
	return paymentStatusBean;
}
public void setPaymentStatusBean(PaymentStatusBeans paymentStatusBean) {
	this.paymentStatusBean = paymentStatusBean;
}
public PetBeans getPetBean() {
	return petBean;
}
public void setPetBean(PetBeans petBean) {
	this.petBean = petBean;
}
public UserDetailsBean getUserDetailsBean() {
	return userDetailsBean;
}
public void setUserDetailsBean(UserDetailsBean userDetailsBean) {
	this.userDetailsBean = userDetailsBean;
}
@Override
public String toString() {
	return "PaymentUserMappingBean [id=" + id + ", paymentStatusBean=" + paymentStatusBean + ", petBean=" + petBean
			+ ", userDetailsBean=" + userDetailsBean + "]";
}
  

}
