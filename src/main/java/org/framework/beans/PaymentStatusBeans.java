package org.framework.beans;

public class PaymentStatusBeans {
	
	private String paymentType = "";
	private String cardHolderName = "";
	private long accountNumber ;
	private String paymentStatus = "";
	private int petId;
    
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	@Override
	public String toString() {
		return "PaymentStatusBeans [paymentType=" + paymentType + ", cardHolderName=" + cardHolderName
				+ ", accountNumber=" + accountNumber + ", paymentStatus=" + paymentStatus + ", petId=" + petId + "]";
	}
}