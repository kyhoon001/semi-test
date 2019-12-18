package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.ProductVO;

public interface OrderService<K,V> extends Service<K,V> {
	@Transactional
	public void register(V v) throws Exception;
	@Transactional
	public void registerdetail(OrderDetailVO v) throws Exception;
	@Transactional
	public void remove(K k) throws Exception;
	@Transactional
	public void modify(V v) throws Exception;
	
	public V get(K k) throws Exception;
	public ArrayList<V> getAll(K k) throws Exception;
	public ArrayList<V> get() throws Exception;
	public int count(K k) throws Exception;
	public void clear(K k) throws Exception;
	public K getorderid() throws Exception;
	public int oinsert(V v) throws Exception;
	public ArrayList<OrderDetailVO> selectdetail(K k) throws Exception;
	public void minusamount(CartProductVO obj)throws Exception;
	public void plussoldamount(CartProductVO obj)throws Exception;
	public ProductVO getproductinfo(int obj)throws Exception;
}
