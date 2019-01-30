package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dao.LoginDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO logDAO = new LoginDAO();
	private LoginDTO logDTO = new LoginDTO();
	private BuyItemDAO buyDAO = new BuyItemDAO();

	public String execute(){
		String rs = ERROR;
		logDTO = logDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", logDTO);

		if(logDTO.getAdminFlg() == 1){
			rs = "admin";
		}

		else if(((LoginDTO)session.get("loginUser")).getLoginFlg()){

			rs=SUCCESS;
			BuyItemDTO buyDTO = buyDAO.getBuyItemInfo();

			session.put("login_user_id", logDTO.getLoginId());
			session.put("id", buyDTO.getId());
			session.put("buyItem_name", buyDTO.getItemName());
			session.put("buyItem_price", buyDTO.getItemPrice());

			return rs;
		}
		return rs;

	}
	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
