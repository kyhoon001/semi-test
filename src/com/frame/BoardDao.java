package com.frame;

import java.util.ArrayList;

import com.vo.BoardVO;
import com.vo.UserInput;

// UserInput을 U로 받음

public interface BoardDao<K, V, U> extends Dao<K, V> {
	
	public void insert(V v);
	public void update(V v);
	public void delete(K k);
	public V select(K k);
	public int selectallcount();
	public ArrayList<V> selectPage(U u);
}
