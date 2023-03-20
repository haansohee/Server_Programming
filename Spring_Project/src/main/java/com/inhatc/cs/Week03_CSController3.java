package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.Week03_MemberVO;
import com.inhatc.domain.Week03_ProductVO;

@Controller
public class Week03_CSController3 {
	
	@RequestMapping("doD")
	public String doB(Model model) {
		System.out.println("doD Called!~~!!~!~!!~~!~");
		
		Week03_ProductVO product = new Week03_ProductVO("inhatc product", 10000);
		
		// model이라는 포장에 프로덕트를 넣어야 행
		model.addAttribute(product);  // 넣어 주면 model에 프로덕트가 담긴 거자나? 그럼 고객은 그 상자(model)를 뜯어보겠찌?		
		return "Week03_productDetail";  // Week03_productDetail.jsp
	}
	
	@RequestMapping("doG")
	public String doG(Model model) {
		System.out.println("doG Called!~~!!~!~!!~~!~");
		
		Week03_MemberVO member = new Week03_MemberVO("Han SoHee", "202144020");
		
		// model이라는 포장에 프로덕트를 넣어야 행
		model.addAttribute(member);  // 넣어 주면 model에 프로덕트가 담긴 거자나? 그럼 고객은 그 상자(model)를 뜯어보겠찌?		
		return "Week03_MemberDetail";  // Week03_MemberDetail.jsp
	}

}
