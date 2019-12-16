package com.shop;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;
import com.vo.CategoryVO;


@org.springframework.stereotype.Service("cateservice")
public class CategoryService implements Service<String, CategoryVO> {

	@Resource(name="catedao")
	Dao<String, CategoryVO> dao;

	@Override
	public void register(CategoryVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public void modify(CategoryVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public CategoryVO get(String k) throws Exception {
		
		return dao.select(k);
	}

	@Override
	public ArrayList<CategoryVO> get() throws Exception {
		return dao.select();
	}

	@Override
	public CategoryVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
