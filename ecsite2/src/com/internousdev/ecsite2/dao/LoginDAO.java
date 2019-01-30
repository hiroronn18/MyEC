package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.LoginDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class LoginDAO {

	private DBConnector dbCon = new DBConnector();
	private Connection con = dbCon.getConnection();
	private LoginDTO dto = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		String sql = "SELECT * FROM login_user_transaction WHERE login_id = ? AND login_pass = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setLoginFlg(true);
				dto.setAdminFlg(rs.getInt("admin_flg"));

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;

	}

	public LoginDTO getLoginDTO(){
		return dto;
	}

}
