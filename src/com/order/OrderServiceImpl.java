package com.order;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.OrderDao;
import com.frame.OrderService;
import com.frame.Service;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;

@org.springframework.stereotype.Service("orderservice")
public class OrderServiceImpl implements OrderService<String, OrderVO> {
	
	@Resource(name="orderdao")
	OrderDao<String, OrderVO> dao;
	
	@Override
	public void register(OrderVO v) throws Exception {
		dao.insert(v);
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

	public ArrayList<OrderVO> getAll(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int count(String k) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void minusamount(String k) throws Exception {
//		dao.minusamount(k);
	}

	public void plussoldamount(String k) throws Exception {
//		dao.plussoldamount(k);
	}

	@Override
	public void clear(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getorderid() throws Exception {
		return dao.getorderid();
	}

	@Override
	public void registerdetail(OrderDetailVO v) throws Exception {
		dao.insertdetail(v);
	}

	
}
