package com.mapper;

import java.util.ArrayList;

import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;
import com.vo.ProductVO;


public interface OrderMapper {
	public void insert(OrderVO obj);
	public void insertdetail(OrderDetailVO obj);
	public void delete(String obj);
	public void update(CartVO obj);
	public CartVO select(String obj);
	public ArrayList<OrderVO> selectall(String obj);
	public ArrayList<CartVO> cselect();
	public int count(String obj);
	public void clear(String obj);
	public String getorderid();
	public int oinsert(OrderVO obj);
	public ArrayList<OrderDetailVO> selectdetail(String k);
	public ProductVO getproductinfo(int obj);
	public void minusamount(CartProductVO obj);
	public void plussoldamount(CartProductVO obj);
}
