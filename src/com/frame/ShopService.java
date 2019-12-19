package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.vo.CartVO;
import com.vo.ProductVO;

public interface ShopService<K, V, U> extends Service<K, V> {

	@Transactional
	public void register(V v) throws Exception;

	@Transactional
	public void remove(K k) throws Exception;

	@Transactional
	public void modify(V v) throws Exception;

	public V get(K k) throws Exception;

	public ArrayList<V> getallnameasc(U u) throws Exception;
	public ArrayList<V> getallnamedesc(U u) throws Exception;
	public ArrayList<V> getallpriceasc(U u) throws Exception;
	public ArrayList<V> getallpricedesc(U u) throws Exception;

	public ArrayList<V> searchingnameasc(U u) throws Exception;
	public ArrayList<V> searchingnamedesc(U u) throws Exception;
	public ArrayList<V> searchingpriceasc(U u) throws Exception;
	public ArrayList<V> searchingpricedesc(U u) throws Exception;
	
	public int getcount()throws Exception;
	public int searchingcount(U u)throws Exception;
	public ArrayList<ProductVO> selectcategory(K k);
}
