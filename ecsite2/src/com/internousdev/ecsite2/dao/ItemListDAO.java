package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class ItemListDAO {


	DBConnector dbCon = new DBConnector();
	Connection con = dbCon.getConnection();

	public ArrayList<ItemInfoDTO> getItemInfo()throws SQLException{
	ArrayList<ItemInfoDTO> itemDTO = new ArrayList<ItemInfoDTO>();

	String sql ="SELECT * FROM item_info_transaction ";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
			ItemInfoDTO dto = new ItemInfoDTO();
			dto.setItemName(rs.getString("item_name"));
			dto.setItemPrice(rs.getString("item_price"));
			dto.setItemStock(rs.getString("item_stock"));

			itemDTO.add(dto);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return itemDTO;
	}

}
