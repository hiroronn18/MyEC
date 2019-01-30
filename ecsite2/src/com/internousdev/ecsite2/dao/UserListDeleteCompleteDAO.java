package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

public class UserListDeleteCompleteDAO {

	public int userListDelete()throws SQLException{

	DBConnector dbCon = new DBConnector();
	Connection con = dbCon.getConnection();

	int i = 0;

	String sql = "DELETE FROM login_user_transaction";

	try{
		PreparedStatement ps = con.prepareStatement(sql);

		i=ps.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}

	return i;
	}

}
