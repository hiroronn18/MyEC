package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String execute(){
		String rs = "login";
		if(session.containsKey("id")){
			BuyItemDAO dao= new BuyItemDAO();
			BuyItemDTO dto = dao.getBuyItemInfo();
			session.put("id", dto.getId());
			session.put("buyItem_Name", dto.getItemName());
			session.put("buyItem_price", dto.getItemPrice());
			rs=SUCCESS;
		}
		return rs;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String, Object> getSession(){
		return this.session;
	}

}
