package com.cart;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;
import com.vo.CartProductVO;
import com.vo.CartVO;


@org.springframework.stereotype.Service("cartservice")
public class CartServiceImpl implements Service<String, CartVO> {
	
	@Resource(name="cartdao")
	Dao<String, CartVO> dao;

	@Override
	public void register(CartVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(CartVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public CartVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<CartProductVO> ggetAll(String k) throws Exception {
		return dao.sselectAll(k);
	}

	@Override
	public ArrayList<CartVO> get() throws Exception {
		
		return dao.select();
	}

	@Override
	public int count(String k) throws Exception {
		return dao.count(k);
	}

	@Override
	public CartVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(String k) throws Exception {
		dao.clear(k);
	}

	@Override
	public CartVO findbyproductid(CartVO obj) throws Exception {
		return dao.findbyproductid(obj);
	}



}
