package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@ResponseBody
	@RequestMapping("/board/write")
	public String write(@RequestParam(value="n", required=true, defaultValue="default") String name) {
		return "BoardController:write()"+name;
	}
	
	@ResponseBody
	@RequestMapping("/board/update")
	public String update(@RequestParam("n") String name) {
		return "BoardController:update()"+name;
	}
	
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable(value="no") Long no) {
		return "BoardController:view("+no+")";
	}
}


