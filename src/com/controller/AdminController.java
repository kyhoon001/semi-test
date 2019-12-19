package com.controller;


import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.frame.ShopService;
import com.vo.CategoryVO;
import com.vo.ProductVO;
import com.vo.UserInput;
import com.vo.Util;

@Controller
public class AdminController {

	@Resource(name = "shoplistservice")
	ShopService<String, ProductVO, UserInput> sservice;

	@Resource(name = "shopservice")
	Service<String, ProductVO> service;
	
	@Resource(name = "cateservice")
	Service<String, CategoryVO> cservice;

	@RequestMapping("pdelete.mc")
	public ModelAndView pdelete(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		String id = request.getParameter("product_id");
		try {
			sservice.remove(id);

		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("pupdatego.mc")
	public ModelAndView pupdetego(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		int id = Integer.parseInt(request.getParameter("product_id"));
		
		try {
			ProductVO vo = service.pick(id);
			mv.addObject("dbproduct", vo);

		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("admin/pupdate");
		return mv;
	}

	@RequestMapping("pupdate.mc")
	public ModelAndView pupdete( ProductVO vo ) {
		ModelAndView mv = new ModelAndView();
	
		String imgname = vo.getMf().getOriginalFilename();
		vo.setImg(imgname);
		mv.addObject("plist", "asdf");
		
		try {

			sservice.modify(vo);
			
			Util.saveFile(vo.getMf());
			mv.addObject("listprint", "ok");
			mv.addObject("Act","Update");

		} catch (Exception e) {
			mv.addObject("listprint", "fail");
			mv.addObject("Act","Update");
			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("pregistergo.mc")
	public ModelAndView pregistergo() {
		ModelAndView mv = new ModelAndView();
		ArrayList<CategoryVO> list =null;
		try {
			list = cservice.get();
			System.out.println(list);
			mv.addObject("clist", list);
		} catch (Exception e) {
			mv.addObject("plist", "asdf");
			mv.addObject("listprint", "fail");
			mv.addObject("Act","Register");
			e.printStackTrace();
		}
	
		mv.setViewName("admin/pregister");
		return mv;
	}
	
	@RequestMapping("pregister.mc")
	public ModelAndView pregister( ProductVO vo ) {
		ModelAndView mv = new ModelAndView();
		
		String imgname = vo.getMf().getOriginalFilename();
		vo.setImg(imgname);
		mv.addObject("plist", "asdf");
		try {

			sservice.register(vo);
			
			Util.saveFile(vo.getMf());
			mv.addObject("listprint", "ok");
			mv.addObject("Act","Register");

		} catch (Exception e) {
			mv.addObject("listprint", "fail");
			mv.addObject("Act","Register");
			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

}
