package com.order;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.OrderVO;

@Repository("orderdao")
public class OrderDAO implements Dao<String, OrderVO> {

	@Override
	public void insert(OrderVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrderVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderVO select(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
