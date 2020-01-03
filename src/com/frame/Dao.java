package com.frame;

import java.util.ArrayList;

import com.vo.CartProductVO;


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
}
