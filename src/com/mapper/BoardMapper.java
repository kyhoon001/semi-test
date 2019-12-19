package com.mapper;

import java.util.ArrayList;

import com.vo.BoardVO;
import com.vo.UserInput;

public interface BoardMapper {

	public void insert(BoardVO bVO);
	public void update(BoardVO bVO);
	public void delete(String str);
	public BoardVO select(String Str);
	public int selectallcount();
	public ArrayList<BoardVO> selectPage(UserInput input);
	
	
	
}
