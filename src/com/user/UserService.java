package com.user;

import java.util.ArrayList;

import javax.annotation.Resource;


import com.frame.Dao;
import com.frame.Service;
import com.vo.UserVO;
@org.springframework.stereotype.Service("uservice")
public class UserService implements Service<String, UserVO> {

	@Resource(name="udao")
	Dao<String,UserVO> dao;
	
	@Override
	public void register(UserVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public void modify(UserVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public UserVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<UserVO> get() throws Exception {
		return dao.select();
	}

	@Override
	public UserVO pick(int obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
