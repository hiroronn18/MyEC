package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbCon = new DBConnector();
	private Connection con = dbCon.getConnection();
	private BuyItemDTO dto = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){

		String sql ="SELECT id , item_name, item_price FROM item_info_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
	}
	public BuyItemDTO getBuyItemDTO(){
		return dto;
	}

}
