package com.order;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;
import com.vo.CartProductVO;
import com.vo.OrderVO;

@org.springframework.stereotype.Service("orderservice")
public class OrderService implements Service<String, OrderVO> {
	
	@Resource(name="orderdao")
	Dao dao;

	@Override
	public void register(OrderVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(OrderVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderVO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
