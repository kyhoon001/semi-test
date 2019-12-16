package com.shop;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;


import com.vo.ProductVO;


@org.springframework.stereotype.Service("shopservice")
public class ShopService implements Service<String, ProductVO> {
	
	@Resource(name="shopdao")
	Dao<String, ProductVO> dao;

	@Override
	public void register(ProductVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public ProductVO get(String k) throws Exception {
		
		return dao.select(k);
	}

	@Override
	public ArrayList<ProductVO> get() throws Exception {
	
		return dao.select();
	}

	@Override
	public ProductVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return dao.pick(obj);
	}

	
	
//	public ArrayList<ProductVO> getDescName() throws Exception {
//		
//		return dao.selectDescName();
//	}
//	
//
//	public ArrayList<ProductVO> getDescPrice() throws Exception {
//		
//		return dao.selectDescPrice();
//	}
//	
//	public ArrayList<ProductVO> getAscPrice() throws Exception {
//		
//		return dao.selectAscPrice();
//	}
//
//	@Override
//	public ArrayList<ProductVO> getAscName() throws Exception {
//		// TODO Auto-generated method stub
//		return dao.selectAscName();
//	}

}
