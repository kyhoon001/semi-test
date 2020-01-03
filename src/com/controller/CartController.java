package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.shop.ShopService;
import com.vo.CartVO;
import com.vo.UserVO;

@Controller
public class CartController {


	@Resource(name = "cartservice")
	Service cservice;
	ShopService pservice;
	

	ArrayList<CartVO> list;
	
	@RequestMapping("cartAdd.mc")
	   public String cartAdd(HttpServletRequest request, HttpSession session) {
	      
	      String email = request.getParameter("email");
	      
	      int product_id = Integer.parseInt(request.getParameter("product_id"));
	      int count = Integer.parseInt(request.getParameter("count"));
	      int cartcount = 0;
	      
	      
	      
	      CartVO cart = new CartVO();
	      
	      cart.setProduct_id(product_id);
	      cart.setEmail(email);
	      cart.setCount(count);
	      cart.setBasket_id("asd");
	     
	      try {
	    	  CartVO cvo = (CartVO) cservice.findbyproductid(cart);
		      if( cvo != null) {
		    	  cvo.setCount(cvo.getCount() + count);
		    	  cservice.modify(cvo);
			      return "redirect:cart.mc";
		      }
	    	  
	    	  
	    	  
	         cservice.register(cart);
	         cartcount = cservice.count(email);
	         session.setAttribute("cartcount", cartcount);
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      return "redirect:cart.mc";
	      
	   }
	

	@RequestMapping("cart.mc")
	public ModelAndView cart(ModelAndView mav,HttpServletRequest request) {
		String email;
		HttpSession session = request.getSession();
		email = (String)session.getAttribute("email"); // 호주씨가 뭐라고 올렸는지 모름
		if(email == null) {
			mav.setViewName("User/Login/login");
	    	  return mav;
	      }
		String errormessage = request.getParameter("errormessage");
		//이제 여기서 selectAll에 where절에 email을 줘서 뽑아오면 되겠지.
		
		try {
			System.out.println(cservice.ggetAll(email));
			list = cservice.ggetAll(email);
			mav.addObject("plist",list);
			mav.addObject("errormessage",errormessage);
			mav.addObject("cartlist", "cartlist");
			mav.addObject("listamount", list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.setViewName("cart");
		return mav;
		
	}





	@RequestMapping("cartupdate.mc")
	public String cartupdate(ModelAndView mav,HttpServletRequest request, HttpSession session ) {
		int list_amount = Integer.parseInt(request.getParameter("list_amount"));
		for(int i = 0; i < list_amount; i++) {
			String basket_id = request.getParameter("basket_id"+i);
			int count = Integer.parseInt(request.getParameter("count"+i));
			CartVO c = new CartVO();
			c.setBasket_id(basket_id);
			c.setCount(count);
			try {
				cservice.modify(c);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
//		mav.addObject(attributeValue)
//		mav.setViewName("cart");
//		return mav;
			 return "redirect:cart.mc";
		      
	}
	
	

	@RequestMapping("cartdelete.mc")
	public String cartdelete(ModelAndView mav, CartVO cart, HttpServletRequest request, HttpSession session) {
		
		String basket_id = request.getParameter("basket_id");
		String email = (String) session.getAttribute("email");
		int cartcount = 0;
		
		try {
			cservice.remove(basket_id);
			cartcount = cservice.count(email);
			session.setAttribute("cartcount", cartcount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cart.mc";
//		mav.setViewName("cart");
//		return mav;
	}
	
	
	
	
}
