package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface CartService<K,V> extends Service<K,V> {
	@Transactional
	public void register(V v) throws Exception;
	@Transactional
	public void remove(K k) throws Exception;
	@Transactional
	public void modify(V v) throws Exception;
	
	public V get(K k) throws Exception;
	public ArrayList<V> getAll(K k) throws Exception;
	public ArrayList<V> get() throws Exception;
	public int count(K k) throws Exception;
}
