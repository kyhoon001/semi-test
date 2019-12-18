package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

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
		//String data�몴占� date 占쏙옙占쎌뿯占쎌몵嚥∽옙 癰귨옙占쎌넎
		Date b_date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			b_date = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//占쎌뵠筌롫뗄�뵬 餓λ쵎�궗筌ｋ똾寃�, user�몴占� �뵳�뗪쉘占쎈릭沃섓옙嚥∽옙 return 揶쏅�れ뵠 null占쎌뵠筌롳옙 占쎈릭占쎈뼊 �굜遺얜굡 占쎈뼄占쎈뻬, null 占쎈툡占쎈빍筌롳옙 餓λ쵎�궗筌ｋ똾寃� 占쎌넇占쎌뵥 筌롫뗄�뻻筌욑옙占쏙옙 占쎈맙�뙼占� 占쎌읈占쎈뼎
		user = new UserVO(email, pwd, name, address, phone, b_date, sex);
		
		try {
			service.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.addObject("name", user.getName());
		mav.addObject("message", "Welcome!!!!");
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
			//main占쎌몵嚥∽옙 揶쏅뗄�뱽 占쎈르 user email�⑨옙 name 占쎈쑓占쎌뵠占쎄숲�몴占� 占쎄퐜疫꿸퀗由� 占쎌맄占쎈맙
			mav.addObject("message","No users or PWD is not corrected");
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
		//String data�몴占� date 占쏙옙占쎌뿯占쎌몵嚥∽옙 癰귨옙占쎌넎
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
	
	@RequestMapping("userDelete.mc")
	public ModelAndView userdelete(String email, ModelAndView mav, HttpSession session) {
		
		try {
			service.remove(email);
			mav.addObject("message", "Successfully withdrawl");
			session.invalidate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.setViewName("User/Register/welcome");
		
		
		return mav;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
