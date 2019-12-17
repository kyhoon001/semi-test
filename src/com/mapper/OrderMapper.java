package com.mapper;

import java.util.ArrayList;

import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;


public interface OrderMapper {
	public void insert(OrderVO obj);
	public void insertdetail(OrderDetailVO obj);
	public void delete(String obj);
	public void update(CartVO obj);
	public CartVO select(String obj);
	public ArrayList<CartVO> selectall(String obj);
	public ArrayList<CartVO> cselect();
	public int count(String obj);
	public void clear(String obj);
	public String getorderid();
}
