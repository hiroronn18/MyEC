package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

public class ItemCreateCompleteDAO {

	DBConnector dbCon = new DBConnector();
	Connection con = dbCon.getConnection();

	String sql = "INSERT INTO item_info_transaction(item_name,item_price,item_stock) VALUES(?,?,?)";

	public void CreateItem(String itemName, String itemPrice, String itemStock)throws SQLException{

		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, itemName);
		ps.setString(2, itemPrice);
		ps.setString(3, itemStock);

		ps.execute();

		}catch(Exception e){
		e.printStackTrace();
		}finally{
		con.close();
		}
	}

}
