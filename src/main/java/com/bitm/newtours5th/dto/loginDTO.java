package com.bitm.newtours5th.dto;

public class loginDTO {
	private String userName;
	private String password;
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
	@Override
	public String toString() {
		  return "LoginDTO [userName=" + userName + ", password=" + password + "]";
		 }
}
