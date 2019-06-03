package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hi HelloControoler");
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("email","djawlths4@naver.com");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	@RequestMapping("/hello3")
	public String hello3(Model model) {
		model.addAttribute("email","djawlths4@naver.com");		

		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello4")
	public String hello4(Model model, @RequestParam("e") String email, String name) {
		model.addAttribute("email",email);	
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello5")
	public String hello5(Model model, HttpServletRequest request) {
		String name = request.getParameter("name");
		model.addAttribute("email",name);	
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
}
