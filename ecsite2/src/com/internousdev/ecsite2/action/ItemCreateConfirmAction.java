package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {

	public String itemName;
	public String itemPrice;
	public String itemStock;
	public Map<String,Object> session;
	private String message;

	public String execute(){

		String rs = ERROR;

		if(!(itemName.equals(""))
				&& !(itemPrice.equals(""))
				&& !(itemStock.equals(""))){
			session.put("ItemName", itemName);
			session.put("ItemPrice", itemPrice);
			session.put("ItemStock", itemStock);
			rs=SUCCESS;

		}else{
			setMessage("未入力の項目があります。");
		}
		return rs;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message= message;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session= session;
	}

}
