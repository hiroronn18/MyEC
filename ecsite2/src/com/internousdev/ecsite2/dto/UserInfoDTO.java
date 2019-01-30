package com.internousdev.ecsite2.dto;

public class UserInfoDTO {

	private String loginId;
	private String loginPass;
	private String userName;
	private String insertDate;
	private String updatedDate;

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId=loginId;
	}

	public String getLoginPass(){
		return loginPass;
	}

	public void setLoginPass(String loginPass){
		this.loginPass=loginPass;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getInsertDate(){
		return insertDate;
	}

	public void setInsertDate(String insertDate){
		this.insertDate=insertDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate=updatedDate;
	}


}
