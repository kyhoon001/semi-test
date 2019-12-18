package com.frame;

import java.util.ArrayList;

import com.vo.CartProductVO;

public interface CartDao<K,V,CPV> extends Dao<K,V> {

	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<CPV> selectAll(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public int count(K k) throws Exception;
	public void clear(K k) throws Exception;
}
