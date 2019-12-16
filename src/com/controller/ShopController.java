package com.controller;

import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comparator.ComparatorNameAsc;
import com.comparator.ComparatorNameDesc;
import com.comparator.ComparatorPriceAsc;
import com.comparator.ComparatorPriceDesc;
import com.frame.Service;
import com.shop.ShopService;
import com.vo.ProductVO;

@Controller
public class ShopController {

	@Resource(name = "shopservice")
	Service<String, ProductVO> service;
	
	

	@RequestMapping("/shop-single.mc")
	public ModelAndView shop_single(ModelAndView mav,HttpServletRequest request) {


		System.out.println("test : " + request.getParameter("id"));
		int product_id = Integer.parseInt(request.getParameter("id"));
		//이제 여기서 selectAll에 where절에 email을 줘서 뽑아오면 되겠지.
		
		try {
			System.out.println(service.pick(product_id));

			ProductVO list = service.pick(product_id);
			System.out.println(list);
			mav.addObject("dbproduct",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.setViewName("viewdetail/shop-single");
		return mav;
	}
	
	
	
	
//	@RequestMapping("/shop-single.mc")
//	public ModelAndView shop_single(
//			HttpServletRequest request
//			) {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		ProductVO dbproduct = null;
//		int product_id = Integer.parseInt(request.getParameter("id"));
//		try {
//			dbproduct = service.get("product_id");
//			if(dbproduct.getProduct_id()==product_id) {
//				mv.addObject("pro_detail", dbproduct);
//				
//			}else {
//				mv.setViewName("shop");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mv.setViewName("shop-single");
//		return mv;
//	}
	
	
	
//	
}
