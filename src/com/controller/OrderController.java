package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.Service;

@Controller
public class OrderController {
	
	@Resource(name="orderservice")
	Service service;
	
	@RequestMapping("order.mc")
	public void order(String email,int totalprice ) {
		
		
	}
	
	
}
