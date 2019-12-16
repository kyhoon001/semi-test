package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.vo.UserVO;

@Controller
public class UserController {
	
	@Resource(name="uservice")
	private Service service;
	
	@RequestMapping("login.mc")
	public String login() {
		
		
		return "User/Login/login";
		
	}
	
	@RequestMapping("register.mc")
	public String register() {
		
		return "User/Register/register";
	}
	
	@RequestMapping("registerimpl.mc")
	public ModelAndView registerimpl(ModelAndView mav, HttpServletRequest request) {
		
		UserVO user = null;
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String date = request.getParameter("b_date");
		String sex = request.getParameter("sex");
		//String data瑜� date ���엯�쑝濡� 蹂��솚
		Date b_date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			b_date = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�씠硫붿씪 以묐났泥댄겕, user瑜� 由ы꽩�븯誘�濡� return 媛믪씠 null�씠硫� �븯�떒 肄붾뱶 �떎�뻾, null �븘�땲硫� 以묐났泥댄겕 �솗�씤 硫붿떆吏��� �븿猿� �쟾�떖
		user = new UserVO(email, pwd, name, address, phone, b_date, sex);
		
		try {
			service.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.addObject("name", user.getName());
		mav.addObject("message", "�떂 �쉶�썝媛��엯�쓣 �솚�쁺�빀�땲�떎");
		mav.setViewName("User/Register/welcome");
		
		return mav;
		
	}
	
	@RequestMapping("duplCheck.mc")
	@ResponseBody
	public int duplCheck(String email) {
		UserVO user = null;
		try {
			user = (UserVO) service.get(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(user!=null) {
			return 1;
		}
		
		return 0;
	}
	
	@RequestMapping("loginimpl.mc")
	public ModelAndView login(ModelAndView mav, HttpServletRequest request, HttpSession session) {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		UserVO user = null;
		try {
			user = (UserVO) service.get(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(user==null || !pwd.equals(user.getPwd())) {
			//main�쑝濡� 媛붿쓣 �븣 user email怨� name �뜲�씠�꽣瑜� �꽆湲곌린 �쐞�븿
			mav.addObject("message","�씠硫붿씪 �샊�� 鍮꾨�踰덊샇媛� ��由쎈땲�떎");
			mav.setViewName("User/Login/login");
			
		}else {
			session.setAttribute("email", user.getEmail());
			session.setAttribute("name", user.getName());
			mav.setViewName("main");
		}
		
		return mav;
		
	}
	
	@RequestMapping("logout.mc")
	public ModelAndView logout(ModelAndView mav, HttpSession session) {
		session.invalidate();
		
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("userDetail.mc")
	public ModelAndView userDetail(ModelAndView mav, UserVO user, HttpServletRequest request) {
		
		String email = request.getParameter("email");
		
		
		try {
			user = (UserVO) service.get(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.addObject("user", user);
		mav.setViewName("User/UserDetail/userDetail");
;		
		return mav;
	}
	
	@RequestMapping("userUpdate.mc")
	public String userUpdate(HttpServletRequest request, HttpSession session) {

		UserVO user = null;
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String date = request.getParameter("b_date");
		String sex = request.getParameter("sex");
		//String data瑜� date ���엯�쑝濡� 蹂��솚
		Date b_date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			b_date = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user = new UserVO(email, pwd, name, address, phone, b_date, sex);
		
		try {
			service.modify(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		session.invalidate();
		
		return "redirect:login.mc";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
