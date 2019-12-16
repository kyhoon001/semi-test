package com.shop;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.ShopMapper;
import com.vo.ProductVO;

@Repository("shopdao")
public class ShopDao implements Dao<String, ProductVO> {

	@Autowired
	ShopMapper shopmap;

	@Override
	public void insert(ProductVO v) throws Exception {
		shopmap.insert(v);
	}

	@Override
	public void delete(String k) throws Exception {
		shopmap.delete(k);
	}

	@Override
	public void update(ProductVO v) throws Exception {
		shopmap.update(v);
	}

	@Override
	public ProductVO select(String k) throws Exception {
		return shopmap.select(k);
	}

	@Override
	public ArrayList<ProductVO> select() throws Exception {

		return shopmap.selectall();
	}

	@Override
	public ProductVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return shopmap.pick(obj);
	}

	

	
//	
//	public ArrayList<ProductVO> selectDescName() throws Exception {
//
//		return shopmap.selectdescname();
//	}
//
//	public ArrayList<ProductVO> selectAscName() throws Exception {
//
//		return shopmap.selectascname();
//	}
//
//	public ArrayList<ProductVO> selectDescPrice() throws Exception {
//
//		return shopmap.selectdescprice();
//	}
//	
//	public ArrayList<ProductVO> selectAscPrice() throws Exception {
//
//		return shopmap.selectascprice();
//	}

}
