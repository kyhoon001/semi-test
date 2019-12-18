package com.shoplist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.ShopDao;
import com.mapper.ShopListMapper;
import com.vo.CartVO;
import com.vo.ProductVO;
import com.vo.UserInput;

@Repository("shoplistdao")
public class ShopDaoImpl implements ShopDao<String, ProductVO, UserInput> {

	@Autowired
	ShopListMapper shopmap;

	@Override
	public ArrayList<ProductVO> select() throws Exception {
		
		return null;
	}

	@Override
	public ProductVO pick(int obj) throws Exception {
		
		return null;
	}

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductVO> selectallnameasc(UserInput u) throws Exception {
		
		return shopmap.selectallnameasc(u);
	}

	@Override
	public ArrayList<ProductVO> searchnameasc(UserInput u) throws Exception {
		
		return shopmap.searchnameasc(u);
	}

	@Override
	public int selectallcount() throws Exception {
		
		return shopmap.selectallcount();
	}

	@Override
	public int searchcount(UserInput u) throws Exception {
		
		return shopmap.searchcount(u);
	}

	@Override
	public ArrayList<ProductVO> selectallnamedesc(UserInput u) throws Exception {
		
		return shopmap.selectallnamedesc(u);
	}

	@Override
	public ArrayList<ProductVO> selectallpriceasc(UserInput u) throws Exception {

		return shopmap.selectallpriceasc(u);
	}

	@Override
	public ArrayList<ProductVO> selectallpricedesc(UserInput u) throws Exception {
	
		return shopmap.selectallpricedesc(u);
	}

	@Override
	public ArrayList<ProductVO> searchnamedesc(UserInput u) throws Exception {
		
		return shopmap.searchnamedesc(u);
	}

	@Override
	public ArrayList<ProductVO> searchpriceasc(UserInput u) throws Exception {
	
		return shopmap.searchpriceasc(u);
	}

	@Override
	public ArrayList<ProductVO> searchpricedesc(UserInput u) throws Exception {
		
		return shopmap.searchpricedesc(u);
	}

	

	


}
