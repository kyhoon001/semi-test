package com.user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.UserMapper;
import com.vo.UserVO;

@Repository("udao")
public class UserDao implements Dao<String, UserVO> {
	
	@Autowired
	UserMapper usermapper;
	
	@Override
	public void insert(UserVO v) throws Exception {
		usermapper.insert(v);
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		usermapper.delete(k);
		
	}

	@Override
	public void update(UserVO v) throws Exception {
		// TODO Auto-generated method stub
		usermapper.update(v);
		
	}

	@Override
	public UserVO select(String k) throws Exception {
		
		return usermapper.select(k);
	}

	@Override
	public ArrayList<UserVO> select() throws Exception {
		// TODO Auto-generated method stub
		
		return usermapper.selectall();
	}

	@Override
	public UserVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
