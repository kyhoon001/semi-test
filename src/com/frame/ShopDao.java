package com.frame;

import java.util.ArrayList;

public interface ShopDao<K,V> extends Dao<K,V> {
	
	public void insert(V v) throws Exception;
	
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public ArrayList<V> search(K k) throws Exception;
	

}
