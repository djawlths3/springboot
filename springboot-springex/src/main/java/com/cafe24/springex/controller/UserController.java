package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	//@ResponseBody
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	// @ResponseBody
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);
		
		if(valid(userVo) ==false) {
			return "/WEB-INF/views/joinform.jsp";
		}
		return "/WEB-INF/views/hello.jsp";
	}
	
	public boolean valid(UserVo vo) {
		
		return false;
	}
}
