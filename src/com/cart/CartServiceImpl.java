package com.cart;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.CartDao;
import com.frame.CartService;
import com.vo.CartProductVO;
import com.vo.CartVO;


@org.springframework.stereotype.Service("cartservice")
public class CartServiceImpl implements CartService<String, CartVO,CartProductVO> {
	
	@Resource(name="cartdao")
	CartDao<String, CartVO,CartProductVO> dao;

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
	public ArrayList<CartProductVO> getAll(String k) throws Exception {
		return dao.selectAll(k);
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
