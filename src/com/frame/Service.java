package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.vo.CartProductVO;

public interface Service<K,V> {
	@Transactional
	public void register(V v) throws Exception;
	@Transactional
	public void remove(K k) throws Exception;
	@Transactional
	public void modify(V v) throws Exception;
	
	public V get(K k) throws Exception;
	public ArrayList<V> get() throws Exception;
	public V pick(int obj) throws Exception;


	//cart
	default public ArrayList<V> getAll(K k) throws Exception {return null;}
	default public ArrayList<CartProductVO> ggetAll(K k) throws Exception{return null;}
	default public int count(K k) throws Exception{return 0;}
	default public void clear(K k) throws Exception{};
	default public V findbyproductid(V obj) throws Exception{return null;}
}



