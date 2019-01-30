package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dao.UserListDAO;
import com.internousdev.ecsite2.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserListAction extends ActionSupport {

	private UserListDAO dao = new UserListDAO();
	private ArrayList<UserInfoDTO> userInfoList = new ArrayList<UserInfoDTO>();


	public String execute()throws SQLException{

		userInfoList = dao.getUserInfo();

		String rs = SUCCESS;
		return rs;
	}

	public ArrayList<UserInfoDTO> getUserInfoList(){
		return this.userInfoList;
	}

}
