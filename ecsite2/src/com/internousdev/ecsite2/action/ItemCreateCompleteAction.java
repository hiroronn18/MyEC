package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {

	private ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();
	public Map<String,Object> session;

	public String execute()throws SQLException{

		dao.CreateItem(session.get("ItemName").toString(), session.get("ItemPrice").toString(), session.get("ItemStock").toString());

		String rs = SUCCESS;
		return rs;

	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


}
