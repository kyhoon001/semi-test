package com.shoplist;

import java.util.ArrayList;

import javax.annotation.Resource;


import com.frame.ShopDao;
import com.frame.ShopService;
import com.vo.ProductVO;
import com.vo.UserInput;


@org.springframework.stereotype.Service("shoplistservice")
public class ShopServiceImpl implements ShopService<String, ProductVO, UserInput> {
	
	@Resource(name="shoplistdao")
	ShopDao<String, ProductVO, UserInput> dao;

	@Override
	public ArrayList<ProductVO> get() throws Exception {
		
		return null;
	}

	@Override
	public ProductVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

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
	
		return null;
	}

	@Override
	public ArrayList<ProductVO> getall(UserInput u) throws Exception {
	
		return dao.selectall(u);
	}

	@Override
	public ArrayList<ProductVO> searching(UserInput u) throws Exception {
	
		return dao.search(u);
	}

	@Override
	public int getcount() throws Exception {
	
		return dao.selectallcount();
	}

	@Override
	public int searchingcount(UserInput u) throws Exception {
		
		return dao.searchcount(u);
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
