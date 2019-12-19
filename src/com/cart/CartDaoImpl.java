package com.cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.CartDao;
import com.mapper.CartMapper;
import com.vo.CartProductVO;
import com.vo.CartVO;

@Repository("cartdao")
public class CartDaoImpl implements CartDao<String, CartVO,CartProductVO> {

	@Autowired
	CartMapper cartmap;

	@Override
	public void insert(CartVO v) throws Exception {
		cartmap.insert(v);
	}

	@Override
	public void delete(String k) throws Exception {
		cartmap.delete(k);
	}

	@Override
	public void update(CartVO v) throws Exception {
		cartmap.update(v);
	}

	@Override
	public CartVO select(String k) throws Exception {
		return cartmap.select(k);
	}

	@Override
	public ArrayList<CartProductVO> selectAll(String k) throws Exception {

		return cartmap.selectall(k);
	}

	@Override
	public ArrayList<CartVO> select() throws Exception {
		return cartmap.cselect();
	}

	@Override
	public int count(String k) throws Exception {
		return cartmap.count(k);
	}

	@Override
	public CartVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(String k) throws Exception {
		cartmap.clear(k);
	}

	@Override
	public CartVO findbyproductid(CartVO obj) throws Exception {
		return cartmap.findbyproductid(obj);
	}



	

}
