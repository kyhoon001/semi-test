package com.mapper;

import java.util.ArrayList;

import com.vo.ProductVO;
import com.vo.UserInput;

public interface ShopListMapper {
	public void insert(ProductVO obj);
	public void delete(String obj);
	public void update(ProductVO obj);
	public ProductVO select(String obj);
	public ArrayList<ProductVO> selectallnameasc(UserInput obj);
	public ArrayList<ProductVO> selectallnamedesc(UserInput obj);
	public ArrayList<ProductVO> selectallpriceasc(UserInput obj);
	public ArrayList<ProductVO> selectallpricedesc(UserInput obj);
	public ArrayList<ProductVO> searchnameasc(UserInput obj);
	public ArrayList<ProductVO> searchnamedesc(UserInput obj);
	public ArrayList<ProductVO> searchpriceasc(UserInput obj);
	public ArrayList<ProductVO> searchpricedesc(UserInput obj);
	public int selectallcount();
	public int searchcount(UserInput obj);
	
}



