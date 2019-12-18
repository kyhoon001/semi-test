package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.ShopService;
import com.vo.Pagination;
import com.vo.ProductVO;
import com.vo.UserInput;

@Controller
public class ShoplistController {

	@Resource(name = "shoplistservice")
	ShopService<String, ProductVO, UserInput> service;

	@RequestMapping("shop.mc")
	public ModelAndView shop(String curPage) {
		ModelAndView mv = new ModelAndView();

		try {
			int count = service.getcount();
			Pagination pg = new Pagination(count, 1);
			UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
			ArrayList<ProductVO> list = service.getallnameasc(input);
			ArrayList<Pagination> page = new ArrayList<Pagination>();

			if (curPage != null) {
				int curPageNum = Integer.parseInt(curPage);

				pg = new Pagination(count, curPageNum);

				input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
				list = service.getallnameasc(input);
		
			}

			page.add(pg);
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("listprint", "productlist");
			mv.addObject("filter","shop");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");

		return mv;
	}

	@RequestMapping("ascname.mc")
	public ModelAndView ascname(HttpServletRequest request,String curPage, String search) {
		ModelAndView mv = new ModelAndView();
		search = request.getParameter("search");
		ArrayList<Pagination> page = new ArrayList<Pagination>();
		ArrayList<ProductVO> list = null;
		try {
			if (curPage == null) {
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, 1);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingnameasc(input);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, 1);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
			
					list = service.getallnameasc(input);

				}
			}

			else {
				int curPageNum = Integer.parseInt(curPage);
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, curPageNum);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingnameasc(input);
					page.add(pg);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, curPageNum);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallnameasc(input);
					page.add(pg);
				}
				
				

			}
			
			if (search != null) {
				mv.addObject("listprint", "selectproductlist");
				mv.addObject("search", search);
			} else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("filter","ascname");
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descname.mc")
	public ModelAndView descname(HttpServletRequest request, String curPage, String search) {
		ModelAndView mv = new ModelAndView();
		search = request.getParameter("search");
		ArrayList<Pagination> page = new ArrayList<Pagination>();
		ArrayList<ProductVO> list = null;
		try {
			if (curPage == null) {
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, 1);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingnamedesc(input);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, 1);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallnamedesc(input);

				}
			}

			else {
				int curPageNum = Integer.parseInt(curPage);
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, curPageNum);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingnamedesc(input);
					page.add(pg);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, curPageNum);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallnamedesc(input);
					page.add(pg);
				}
				
				

			}
			
			if (search != null) {
				mv.addObject("listprint", "selectproductlist");
				mv.addObject("search", search);
			} else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("filter","descname");
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("ascprice.mc")
	public ModelAndView ascprice(HttpServletRequest request,String curPage, String search) {
		ModelAndView mv = new ModelAndView();
		search = request.getParameter("search");
		ArrayList<Pagination> page = new ArrayList<Pagination>();
		ArrayList<ProductVO> list = null;
		try {
			if (curPage == null) {
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, 1);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingpriceasc(input);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, 1);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallpriceasc(input);

				}
			}

			else {
				int curPageNum = Integer.parseInt(curPage);
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, curPageNum);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingpriceasc(input);
					page.add(pg);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, curPageNum);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallpriceasc(input);
					page.add(pg);
				}
				
				

			}
			
			if (search != null) {
				mv.addObject("listprint", "selectproductlist");
				mv.addObject("search", search);
			} else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("filter","ascprice");

		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descprice.mc")
	public ModelAndView descprice(HttpServletRequest request,String curPage, String search) {

		ModelAndView mv = new ModelAndView();
		search = request.getParameter("search");
		ArrayList<Pagination> page = new ArrayList<Pagination>();
		ArrayList<ProductVO> list = null;
		try {
			if (curPage == null) {
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, 1);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingpricedesc(input);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, 1);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallpricedesc(input);

				}
			}

			else {
				int curPageNum = Integer.parseInt(curPage);
				if (search != null) {
					UserInput input = new UserInput(search);
					int count = service.searchingcount(input);
					Pagination pg = new Pagination(count, curPageNum);
					input = new UserInput(search, pg.getStartIndex(), pg.getEndIndex());
					list = service.searchingpricedesc(input);
					page.add(pg);

				} else {
					int count = service.getcount();
					Pagination pg = new Pagination(count, curPageNum);
					UserInput input = new UserInput(pg.getStartIndex(), pg.getEndIndex());
					list = service.getallpricedesc(input);
					page.add(pg);
				}
				
				

			}
			
			if (search != null) {
				mv.addObject("listprint", "selectproductlist");
				mv.addObject("search", search);
			} else {
				mv.addObject("listprint", "productlist");
			}
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("filter","descprice");

		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("/search.mc")
	public ModelAndView search(HttpServletRequest request, String curPage, String search) {

		search = request.getParameter("search");
		UserInput input = new UserInput(search);
		
		ModelAndView mv = new ModelAndView();
		ArrayList<ProductVO> list = null;
		ArrayList<Pagination> page = new ArrayList<Pagination>();

		try {
			int count = service.searchingcount(input);
			if (curPage == null) {
			Pagination pg = new Pagination(count, 1);
			input =  new UserInput(search,pg.getStartIndex(),pg.getEndIndex());
			list = service.searchingnameasc(input);
			page.add(pg);
			

			}
			else {
				int curPageNum = Integer.parseInt(curPage);
				Pagination pg = new Pagination(count, curPageNum);
				input =  new UserInput(search,pg.getStartIndex(),pg.getEndIndex());
				list = service.searchingnameasc(input);
				System.out.println(list);
				page.add(pg);

			}
			

			mv.addObject("listprint", "selectproductlist");
			mv.addObject("plist", list);
			mv.addObject("pagination", page);
			mv.addObject("search", search);
			mv.addObject("filter","search");
		} catch (Exception e) {

			e.printStackTrace();
		}

		mv.setViewName("viewshop/shop");
		return mv;
	}
}
