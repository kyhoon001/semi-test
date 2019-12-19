package com.board;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.BoardDao;
import com.frame.BoardService;
import com.vo.BoardVO;
import com.vo.UserInput;

@org.springframework.stereotype.Service("boardservice")
public class BoardServiceImpl implements BoardService<String, BoardVO, UserInput>{
	
	@Resource(name="boarddao")
	BoardDao<String, BoardVO, UserInput> dao;
	
	@Override
	public ArrayList<BoardVO> get() throws Exception {
		return null;
	}

	@Override
	public BoardVO pick(int obj) throws Exception {
		return null;
	}

	@Override
	public void register(BoardVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(BoardVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public BoardVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public int getallcount() throws Exception {
		return dao.selectallcount();
	}

	@Override
	public ArrayList<BoardVO> getPage(UserInput u) throws Exception {
		return dao.selectPage(u);
	}

}
