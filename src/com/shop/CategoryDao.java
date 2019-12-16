package com.shop;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.CategoryMapper;
import com.vo.CategoryVO;

@Repository("catedao")
public class CategoryDao implements Dao<String, CategoryVO> {
	@Autowired
	CategoryMapper catemap;
	
	@Override
	public void insert(CategoryVO v) throws Exception {
		catemap.insert(v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		catemap.delete(k);
		
	}

	@Override
	public void update(CategoryVO v) throws Exception {
		catemap.update(v);
		
	}

	@Override
	public CategoryVO select(String k) throws Exception {
		
		return catemap.select(k);
	}

	@Override
	public ArrayList<CategoryVO> select() throws Exception {
		return catemap.selectall();
	}

	@Override
	public CategoryVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
