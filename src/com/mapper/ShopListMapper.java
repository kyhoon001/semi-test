package com.mapper;

import java.util.ArrayList;

import com.vo.ProductVO;
import com.vo.UserInput;

public interface ShopListMapper {
	public void insert(ProductVO obj);
	public void delete(String obj);
	public void update(ProductVO obj);
	public ProductVO select(String obj);
	public ArrayList<ProductVO> selectall(UserInput obj);
	public ArrayList<ProductVO> search(UserInput obj);
	public int selectallcount();
	public int searchcount(UserInput obj);
	
}



