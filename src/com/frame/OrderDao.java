package com.frame;

import java.util.ArrayList;

import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.ProductVO;

public interface OrderDao<K,V> extends Dao<K,V> {

	public void insert(V v) throws Exception;
	public void insertdetail(OrderDetailVO v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> selectAll(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public int count(K k) throws Exception;
	public void clear(K k) throws Exception;
	public K getorderid() throws Exception;
	public int oinsert(V v) throws Exception;
	public ArrayList<OrderDetailVO> selectdetail(K k) throws Exception; 
	public void minusamount(CartProductVO obj)throws Exception;
	public void plussoldamount(CartProductVO obj)throws Exception;
	public ProductVO getproductinfo(int obj)throws Exception;
}
