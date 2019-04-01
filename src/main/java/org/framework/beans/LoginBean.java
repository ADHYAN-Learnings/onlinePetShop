/** @Author AdityaPandey
 *  29 Apr 2018
 */
package org.framework.beans;

public class LoginBean {
	private String username = "";
	private String password = "";
	private int userId;
	private String roleType = "";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + ", userId=" + userId + "]";
	}
	

}
