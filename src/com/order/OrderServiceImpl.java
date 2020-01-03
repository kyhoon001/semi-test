package com.order;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;
import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;
import com.vo.ProductVO;

@org.springframework.stereotype.Service("orderservice")
public class OrderServiceImpl implements Service<String, OrderVO> {
	
	@Resource(name="orderdao")
	Dao<String, OrderVO> dao;
	
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
		return dao.selectAll(k);
	}

	public int count(String k) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void minusamount(CartProductVO obj) throws Exception {
		dao.minusamount(obj);
	}

	public void plussoldamount(CartProductVO obj) throws Exception {
		dao.plussoldamount(obj);
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

	@Override
	public int oinsert(OrderVO v) throws Exception {
		return dao.oinsert(v);
	}

	@Override
	public ArrayList<OrderDetailVO> selectdetail(String k) throws Exception {
		return dao.selectdetail(k);
	}

	@Override
	public ProductVO getproductinfo(Integer obj) throws Exception {
		return dao.getproductinfo(obj);
	}

	
}
