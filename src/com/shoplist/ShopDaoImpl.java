package com.shoplist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.ShopDao;
import com.mapper.ShopListMapper;
import com.vo.ProductVO;
import com.vo.UserInput;

@Repository("shoplistdao")
public class ShopDaoImpl implements ShopDao<String, ProductVO, UserInput> {

	@Autowired
	ShopListMapper shopmap;

	@Override
	public ArrayList<ProductVO> select() throws Exception {
		
		return null;
	}

	@Override
	public ProductVO pick(int obj) throws Exception {
		
		return null;
	}

	@Override
	public void insert(ProductVO v) throws Exception {
		shopmap.insert(v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		shopmap.delete(k);
		
	}

	@Override
	public void update(ProductVO v) throws Exception {
		shopmap.update(v);
		
	}

	@Override
	public ProductVO select(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductVO> selectall(UserInput u) throws Exception {
		
		return shopmap.selectall(u);
	}

	@Override
	public ArrayList<ProductVO> search(UserInput u) throws Exception {
		
		return shopmap.search(u);
	}

	@Override
	public int selectallcount() throws Exception {
		
		return shopmap.selectallcount();
	}

	@Override
	public int searchcount(UserInput u) throws Exception {
		
		return shopmap.searchcount(u);
	}


	

	
	

	
//	
//	public ArrayList<ProductVO> selectDescName() throws Exception {
//
//		return shopmap.selectdescname();
//	}
//
//	public ArrayList<ProductVO> selectAscName() throws Exception {
//
//		return shopmap.selectascname();
//	}
//
//	public ArrayList<ProductVO> selectDescPrice() throws Exception {
//
//		return shopmap.selectdescprice();
//	}
//	
//	public ArrayList<ProductVO> selectAscPrice() throws Exception {
//
//		return shopmap.selectascprice();
//	}

}
