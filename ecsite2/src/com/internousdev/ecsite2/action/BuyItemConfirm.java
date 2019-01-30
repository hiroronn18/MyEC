package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirm extends ActionSupport implements SessionAware {

	public Map<String,Object> session;
	private BuyItemCompleteDAO dao = new BuyItemCompleteDAO();

	public String execute()throws SQLException{
		dao.buyItemInfo(session.get("id").toString(),session.get("login_user_id").toString() , session.get("total_price").toString(), session.get("count").toString(), session.get("pay").toString());

		String rs = SUCCESS;
		return rs;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
