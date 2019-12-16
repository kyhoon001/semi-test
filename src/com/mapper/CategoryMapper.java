package com.mapper;

import java.util.ArrayList;

import com.vo.CategoryVO;

public interface CategoryMapper {
	public void insert(CategoryVO obj);
	public void delete(String obj);
	public void update(CategoryVO obj);
	public CategoryVO select(String obj);
	public ArrayList<CategoryVO> selectall();
	
}



