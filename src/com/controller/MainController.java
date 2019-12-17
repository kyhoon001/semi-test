package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("main.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("about.mc")
	public ModelAndView about(ModelAndView mav) {
		mav.addObject("center", "about");
		mav.setViewName("main");
		return mav;
	}

	

	@RequestMapping("orderlist.mc")
	public ModelAndView orderlist(ModelAndView mav) {
		mav.addObject("center", "orderlist");
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("orderdetail.mc")
	public ModelAndView orderdetail(ModelAndView mav) {
		mav.addObject("center", "orderdetail");
		mav.setViewName("main");
		return mav;
	}

}
