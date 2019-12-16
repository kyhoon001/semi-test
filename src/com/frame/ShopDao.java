package com.frame;

import java.util.ArrayList;

public interface ShopDao<K,V,U> extends Dao<K,V> {
	
	public void insert(V v) throws Exception;
	
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> selectall(U u) throws Exception;
	public ArrayList<V> search(U u) throws Exception;
	public int selectallcount()throws Exception;
	public int searchcount(U u)throws Exception;
	

}
