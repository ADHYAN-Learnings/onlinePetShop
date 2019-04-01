package org.framework.beans;

public class UserDetailsBean extends ResponseBean<UserDetailsBean> {
	
	private int userId;
	private String userName = "";
	private String password = "";
	private String landMark = "";
	private Long pincode;
	private String district = "";
	private String city = "";
	private String state = "";
	private String roleType ="";
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	@Override
	public String toString() {
		return "UserDetailsBean [userId=" + userId + ", userName=" + userName + ", password=" + password + ", landMark="
				+ landMark + ", pincode=" + pincode + ", district=" + district + ", city=" + city + ", state=" + state
				+ ", roleType=" + roleType + "]";
	}


	
}
