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

import com.frame.CartService;
import com.frame.Service;
import com.vo.UserVO;

@Controller
public class UserController {
	
	@Resource(name="uservice")
	private Service service;
	@Resource(name="cartservice")
	private CartService cartservice;
	
	@RequestMapping("login.mc")
	public ModelAndView login() {
		
ModelAndView mv = new ModelAndView();
		
		mv.setViewName("User/Login/login");
		return mv;
		
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
		//String data占쎈ご�뜝占� date �뜝�룞�삕�뜝�럩肉��뜝�럩紐드슖�댙�삕 �솻洹⑥삕�뜝�럩�꼶
		Date b_date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			b_date = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�뜝�럩逾좂춯濡ル뾼占쎈뎄 繞벿살탮占쎄텢嶺뚳퐢�샑野껓옙, user占쎈ご�뜝占� 占쎈뎨占쎈뿪�돇�뜝�럥由�亦껋꼻�삕�슖�댙�삕 return �뤆�룆占썬굦逾� null�뜝�럩逾좂춯濡녹삕 �뜝�럥由��뜝�럥堉� 占쎄턀�겫�뼔援� �뜝�럥堉꾢뜝�럥六�, null �뜝�럥�닡�뜝�럥鍮띸춯濡녹삕 繞벿살탮占쎄텢嶺뚳퐢�샑野껓옙 �뜝�럩�꼪�뜝�럩逾� 嶺뚮∥�뾼占쎈뻣嶺뚯쉻�삕�뜝�룞�삕 �뜝�럥留숋옙�쇊�뜝占� �뜝�럩�쓧�뜝�럥堉�
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
		int cartcount = 0;
		
		try {
			user = (UserVO) service.get(email);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(user==null || !pwd.equals(user.getPwd())) {
			mav.addObject("message","No users or PWD is not corrected");
			mav.setViewName("User/Login/login");
			
			
		}else {
			session.setAttribute("email", user.getEmail());
			session.setAttribute("name", user.getName());
			try {
				cartcount = cartservice.count(email);
				System.out.println(cartcount);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.setAttribute("cartcount", cartcount);
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
		//String data占쎈ご�뜝占� date �뜝�룞�삕�뜝�럩肉��뜝�럩紐드슖�댙�삕 �솻洹⑥삕�뜝�럩�꼶
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
