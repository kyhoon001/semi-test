package com.mapper;

import java.util.ArrayList;

import com.vo.ProductVO;

public interface ShopListMapper {
	public void insert(ProductVO obj);
	public void delete(String obj);
	public void update(ProductVO obj);
	public ProductVO select(String obj);
	public ArrayList<ProductVO> selectall();
	public ArrayList<ProductVO> search(String obj);
}



