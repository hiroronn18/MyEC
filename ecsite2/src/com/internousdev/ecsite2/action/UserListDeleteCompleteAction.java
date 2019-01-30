package com.internousdev.ecsite2.action;

import java.sql.SQLException;

import com.internousdev.ecsite2.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport {

	public int i;



	public String execute(){
		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
		try{
			i=dao.userListDelete();
		}catch(SQLException e){
			e.printStackTrace();
		}



		String rs =SUCCESS;
		return rs;
	}

}
