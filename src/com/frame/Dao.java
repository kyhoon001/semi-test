package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.vo.CartProductVO;
import com.vo.OrderDetailVO;
import com.vo.ProductVO;


public interface Dao<K,V> {
	default public void insert(V v) throws Exception{}
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public V pick(int obj) throws Exception;
	
	
	//cart
	
	default public ArrayList<CartProductVO> sselectAll(K k) throws Exception{return null;}
	default public ArrayList<V> selectAll(K k) throws Exception{return null;}
	default public int count(K k) throws Exception{return 0;}
	default public void clear(K k) throws Exception{};
	default public V findbyproductid(V obj) throws Exception{return null;}
	
	
	//order
	default public K getorderid() throws Exception{return null;}
	default public int oinsert(V v) throws Exception{return 0;}
	default public ArrayList<OrderDetailVO> selectdetail(K k) throws Exception{return null;} 
	default public void minusamount(CartProductVO cpv)throws Exception{};
	default public void plussoldamount(CartProductVO cpv)throws Exception{};
	default public ProductVO getproductinfo(Integer i)throws Exception{return null;}
	@Transactional
	default public void insertdetail(OrderDetailVO v) throws Exception{};
}
