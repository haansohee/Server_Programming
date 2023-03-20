package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.Week03_ProductVO;

@Controller
public class Week03_CSController5 {

	@RequestMapping("doJSON")
	public @ResponseBody Week03_ProductVO doJSON() {  // 오브젝트 자체를 떨구는 게 있땅..-> ResponseBody
		System.out.println("doJSON Called~!~!@~~!~~~!@~");
		
		Week03_ProductVO vo = new Week03_ProductVO("Spring Product", 100000);
		
		return vo;
	}
}
