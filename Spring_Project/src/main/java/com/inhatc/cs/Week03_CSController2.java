package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Week03_CSController2 {
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {  // ModelAttribute: 사용자의 요청 인자를 View에 떨궈줌
		System.out.println("doC Called");
		return "Week03_result";  // result jsp
	}
}
