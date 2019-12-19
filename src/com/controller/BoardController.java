package com.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.BoardService;
import com.vo.BoardVO;
import com.vo.Pagination;
import com.vo.UserInput;

@Controller
public class BoardController {
	
	@Resource(name="boardservice")
	BoardService<String, BoardVO, UserInput> bservice;
	
	@RequestMapping("board.mc")
	public ModelAndView boardgo(String curPage) {
		ModelAndView mv = new ModelAndView();
		ArrayList<BoardVO> list =null;
		Pagination page =null;

		try {
			if(curPage ==null) {
			
			page = new Pagination(bservice.getallcount(), 1);
			UserInput input = new UserInput(page.getStartIndex(),page.getEndIndex());
			list = bservice.getPage(input);
			}
			
			else {
				page = new Pagination(bservice.getallcount(), Integer.parseInt(curPage));
				UserInput input = new UserInput(page.getStartIndex(),page.getEndIndex());
				list = bservice.getPage(input);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("page",page);
		mv.addObject("filter","board");
		mv.addObject("blist",list);
		mv.addObject("center","board");
		mv.setViewName("main");
		
		return mv;
	}
	
	@RequestMapping("bregister.mc")
	public ModelAndView bregistergo(String curPage,HttpServletRequest request  ) {
		ModelAndView mv = new ModelAndView();
		String email;
		HttpSession session = request.getSession();
		email = (String)session.getAttribute("email"); // È£ÁÖ¾¾°¡ ¹¹¶ó°í ¿Ã·È´ÂÁö ¸ð¸§
		if(email == null) {
			mv.setViewName("User/Login/login");
	    	  return mv;
	      }
		mv.addObject("center","bregister");
		mv.setViewName("main");
		
		return mv;
	}
	
	@RequestMapping("bregisterimpl.mc")
	public String bregisterimpl(String category_id, String contents, String email) {
		Date date = new Date();
		BoardVO vo = new BoardVO(email,contents,date,date,category_id);
	
		try {
			bservice.register(vo);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		return "redirect:board.mc";
	}

	
	
	
	@RequestMapping("selectboardimpl.mc")
	public ModelAndView selectboardimpl(String board_id) {
		ModelAndView mv = new ModelAndView();
		BoardVO vo = null;
		try {
			vo = bservice.get(board_id);
			System.out.println(vo);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		mv.addObject("center","selectboard");
		mv.addObject("boardVO", vo);
		mv.setViewName("main");
		
		return mv;
	}
	
	
	@RequestMapping("bupdate.mc")
	public ModelAndView bupdate(String category_id, String contents, String board_id) {
		ModelAndView mv = new ModelAndView();
		Date date = new Date();
		BoardVO vo = new BoardVO(board_id,contents,date,category_id);
	
		System.out.println(vo);
		try {
			bservice.modify(vo);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		mv.addObject("center","board");
		mv.setViewName("main");
		
		return mv;
	}
	
	@RequestMapping("bupdatego.mc")
	public ModelAndView bupdatego(String board_id ) {
		ModelAndView mv = new ModelAndView();
		BoardVO vo = null;
		try {
			vo = bservice.get(board_id);
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		mv.addObject("boardVO", vo);
		mv.addObject("center","bupdate");
		mv.setViewName("main");
		
		return mv;
	}
	
	@RequestMapping("bdelete.mc")
	public ModelAndView bdelete(String board_id ) {
		ModelAndView mv = new ModelAndView();
		try {
			bservice.remove(board_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center","board");
		mv.setViewName("main");
		
		return mv;
	}
}
