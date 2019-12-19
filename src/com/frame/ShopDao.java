package com.frame;

import java.util.ArrayList;

import com.vo.CartVO;
import com.vo.ProductVO;

public interface ShopDao<K,V,U> extends Dao<K,V> {
	
	public void insert(V v) throws Exception;
	
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> selectallnameasc(U u) throws Exception;
	public ArrayList<V> selectallnamedesc(U u) throws Exception;
	public ArrayList<V> selectallpriceasc(U u) throws Exception;
	public ArrayList<V> selectallpricedesc(U u) throws Exception;
	public ArrayList<V> searchnameasc(U u) throws Exception;
	public ArrayList<V> searchnamedesc(U u) throws Exception;
	public ArrayList<V> searchpriceasc(U u) throws Exception;
	public ArrayList<V> searchpricedesc(U u) throws Exception;
	public int selectallcount()throws Exception;
	public int searchcount(U u)throws Exception;
	public ArrayList<ProductVO> selectcategory(K k);
	

}
