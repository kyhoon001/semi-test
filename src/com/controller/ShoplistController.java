package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.comparator.ComparatorNameAsc;
import com.comparator.ComparatorNameDesc;
import com.comparator.ComparatorPriceAsc;
import com.comparator.ComparatorPriceDesc;
import com.frame.ShopService;
import com.vo.Pagination;
import com.vo.ProductVO;
import com.vo.UserInput;

@Controller
public class ShoplistController {

	@Resource(name = "shoplistservice")
	ShopService<String, ProductVO> service;

	ArrayList<ProductVO> list;

	ComparatorNameAsc compnameasc = new ComparatorNameAsc();
	ComparatorPriceAsc comppriceasc = new ComparatorPriceAsc();
	ComparatorNameDesc compnamedesc = new ComparatorNameDesc();
	ComparatorPriceDesc comppricedesc = new ComparatorPriceDesc();

	@RequestMapping("shop.mc")
	public ModelAndView shop(String curPage) {
		ModelAndView mv = new ModelAndView();

		try {
			ArrayList<ProductVO> list = service.get();
			ArrayList<Pagination> page = new ArrayList<Pagination>();
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);
			if (this.list == null) {
				this.list = list;
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("listprint", "productlist");

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");

		return mv;
	}

	@RequestMapping("ascname.mc")
	public ModelAndView ascname(String curPage,String search) {
		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();
	

		try {
			if(search != null) {
			list = service.searching(search);
			Collections.sort(list, compnameasc);
			}
			else {
				list = service.get();
				Collections.sort(list, compnameasc);
			}
			this.list = list;
			
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);
			if(search != null) {
			mv.addObject("listprint", "selectproductlist");
			mv.addObject("search",search);
			}
			else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descname.mc")
	public ModelAndView descname(String curPage, String search) {
		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();
	

		try {
			if(search != null) {
			list = service.searching(search);
			Collections.sort(list, compnamedesc);
			}
			else {
				list = service.get();
				Collections.sort(list, compnamedesc);
			}
			this.list = list;
			
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);
			if(search != null) {
			mv.addObject("listprint", "selectproductlist");
			mv.addObject("search",search);
			}
			else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("ascprice.mc")
	public ModelAndView ascprice(String curPage, String search) {
		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();
	
	
		try {
			if(search != null) {
			list = service.searching(search);
			Collections.sort(list, comppriceasc);
			}
			else {
				list = service.get();
				Collections.sort(list, comppriceasc);
			}
			this.list = list;
			
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);
			if(search != null) {
			mv.addObject("listprint", "selectproductlist");
			mv.addObject("search",search);
			}
			else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descprice.mc")
	public ModelAndView descprice(String curPage, String search ) {


		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();
	
	
		try {
			if(search != null) {
			list = service.searching(search);
			Collections.sort(list, comppricedesc);
			}
			else {
				list = service.get();
				Collections.sort(list, comppricedesc);
			}
			this.list = list;
			
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);
			if(search != null) {
			mv.addObject("listprint", "selectproductlist");
			mv.addObject("search",search);
			}
			else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("/search.mc")
	public ModelAndView search(HttpServletRequest request, String curPage, String search) {

		search = request.getParameter("search");

		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();
	
	
		try {
			list = service.searching(search);
			this.list = list;
			
			Pagination pg = new Pagination(list.size(), 1);

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(list.size(), curPageNum);

			}
			page.add(pg);

			mv.addObject("listprint", "selectproductlist");
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("search",search);
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}
}
