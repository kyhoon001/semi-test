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
	public int getcount() throws Exception {
	
		return dao.selectallcount();
	}

	@Override
	public int searchingcount(UserInput u) throws Exception {
		
		return dao.searchcount(u);
	}

	@Override
	public ArrayList<ProductVO> getallnameasc(UserInput u) throws Exception {
		
		return dao.selectallnameasc(u);
	}

	@Override
	public ArrayList<ProductVO> getallnamedesc(UserInput u) throws Exception {
		
		return dao.selectallnamedesc(u);
		
	}

	@Override
	public ArrayList<ProductVO> getallpriceasc(UserInput u) throws Exception {
		
		return dao.selectallpriceasc(u);
	}

	@Override
	public ArrayList<ProductVO> getallpricedesc(UserInput u) throws Exception {
	
		return dao.selectallpricedesc(u);
	}

	@Override
	public ArrayList<ProductVO> searchingnameasc(UserInput u) throws Exception {
		
		return dao.searchnameasc(u);
	}

	@Override
	public ArrayList<ProductVO> searchingnamedesc(UserInput u) throws Exception {
		
		return dao.searchnamedesc(u);
	}

	@Override
	public ArrayList<ProductVO> searchingpriceasc(UserInput u) throws Exception {

		return dao.searchpriceasc(u);
	}

	@Override
	public ArrayList<ProductVO> searchingpricedesc(UserInput u) throws Exception {
		
		return dao.searchpricedesc(u);
	}


}
