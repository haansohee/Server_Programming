package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Week03_CSController4 {
	
	@RequestMapping("doE")
	public String doE (RedirectAttributes rttr) {
		System.out.println("doE Called ~~~ ");
		
		rttr.addFlashAttribute("msg", "redirect MSG is YaOng");
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public String doF (@ModelAttribute("msg") String msg) {
		System.out.println("doF Called ~~~ ");
		return "Week03_doF";  // Week03_doF.jsp
	}

}
