package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // (1) 지시자
public class Week03_CSController {
	// (2) URL 맵핑
	@RequestMapping("doA")
	public void doA() {
		System.out.println("doA Called!!~!~!~!~");
	}
	
	@RequestMapping("doB")
	public String doB() {
		System.out.println("doB Called!!~!~!~!~");
		
		return "Week03_cs";
	}
	
}
