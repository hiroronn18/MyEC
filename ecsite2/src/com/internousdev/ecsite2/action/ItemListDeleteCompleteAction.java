package com.internousdev.ecsite2.action;

import java.sql.SQLException;

import com.internousdev.ecsite2.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport {
	public int i;

	public String execute(){



		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();

		try{
			i=dao.itemListDelete();

		}catch(SQLException e){
			e.printStackTrace();
		}


		String rs =SUCCESS;
		return rs;
	}

}
