package com.order;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.frame.OrderDao;
import com.mapper.CartMapper;
import com.mapper.OrderMapper;
import com.mapper.ShopMapper;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;

@Repository("orderdao")
public class OrderDAOImpl implements OrderDao<String, OrderVO> {
	@Autowired
	OrderMapper ordermap;
	@Autowired
	CartMapper cartmap;
	@Autowired
	ShopMapper shopmap;
	
	
	@Override
	public void insert(OrderVO v) throws Exception {
		System.out.println("call dao" + v);
		ordermap.insert(v);
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


	public ArrayList<OrderVO> selectAll(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int count(String k) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getorderid() throws Exception {
		return ordermap.getorderid();
	}
	
	public void minusamount(String k) throws Exception {
		shopmap.minusamount(k);
	}

	public void plussoldamount(String k) throws Exception {
		shopmap.plussoldamount(k);
	}

	@Override
	public void clear(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertdetail(OrderDetailVO v) throws Exception {
		ordermap.insertdetail(v);
	}

}
