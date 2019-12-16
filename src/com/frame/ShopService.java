package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface ShopService<K, V, U> extends Service<K, V> {

	@Transactional
	public void register(V v) throws Exception;

	@Transactional
	public void remove(K k) throws Exception;

	@Transactional
	public void modify(V v) throws Exception;

	public V get(K k) throws Exception;

	public ArrayList<V> getall(U u) throws Exception;

	public ArrayList<V> searching(U u) throws Exception;
	
	public int getcount()throws Exception;
	public int searchingcount(U u)throws Exception;
}
