package com.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.BoardDao;
import com.mapper.BoardMapper;
import com.vo.BoardVO;
import com.vo.UserInput;

@Repository("boarddao")
public class BoardDaoImpl implements BoardDao<String, BoardVO, UserInput> {

	@Autowired
	BoardMapper boardmap;
	
	
	@Override
	public ArrayList<BoardVO> select() throws Exception {
		return null;
	}

	@Override
	public BoardVO pick(int obj) throws Exception {
		return null;
	}

	@Override
	public void insert(BoardVO v) {
		boardmap.insert(v);
	}

	@Override
	public void update(BoardVO v) {
		boardmap.update(v);
		
	}

	@Override
	public void delete(String k) {
		boardmap.delete(k);
	}

	@Override
	public BoardVO select(String k) {
		return boardmap.select(k);
	}

	@Override
	public int selectallcount() {
		return boardmap.selectallcount();
	}

	@Override
	public ArrayList<BoardVO> selectPage(UserInput u) {
		return boardmap.selectPage(u);
	}
	
}
