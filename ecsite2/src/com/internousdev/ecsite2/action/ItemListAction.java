package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dao.ItemListDAO;
import com.internousdev.ecsite2.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListAction extends ActionSupport {

	private ItemListDAO dao = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoList = new ArrayList<ItemInfoDTO>();

	public String execute()throws SQLException{

		itemInfoList = dao.getItemInfo();

		String rs = SUCCESS;

		return rs;

	}

	public ArrayList<ItemInfoDTO> getItemInfoList(){
		return this.itemInfoList;
	}

}
