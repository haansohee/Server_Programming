package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.service.BoardService;

@Controller  // 나 컨트롤러예용~
@RequestMapping("/board/*") //  사용자의 리퀘스트(요청)가 Board이면 Board밑의 모든 것은 이 컨트롤러가 관여하겠습니당
public class BoardController {
	
	@Inject
	private BoardService service;  // 서비스를 주입(인젝트)합니당 

	@RequestMapping(value = "/regist", method=RequestMethod.GET)
	public String registGET(BoardVO board, Model model) throws Exception {
		System.out.println("Regist (GET) Called~~");
		return "/board/regist";  // regist.jsp
	}
	
	@RequestMapping(value = "/regist", method=RequestMethod.POST)
	public String registGET(BoardVO vo, RedirectAttributes rttr) throws Exception {
		System.out.println("Regist (POST) Called~~");
		service.regist(vo);
		return "redirect:/board/listAll2"; 
	}
	
//	public void registGET(BoardVO board, Model model) throws Exception {
//		System.out.println("Regist (GET) Called~~");
//	}
	
//	@RequestMapping(value = "/regist", method=RequestMethod.POST)
//	public String registPOST(BoardVO board, Model model) throws Exception {
//		System.out.println("제목 : " + board.getTitle());
//		System.out.println("내용 : " + board.getContent());
//		System.out.println("글쓴이 : " + board.getWriter());
//		System.out.println("Regist (POST) Called~~");
//		service.regist(board);
//		return "/home";  // home.jsp 
//	}
	
	@RequestMapping(value = "/listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception {
		System.out.println("Regist listAll Page Called~~");
		model.addAttribute("list", service.listAll());
		return "/board/listAll2";  // listAll2.jsp
	}
	
	@RequestMapping(value = "/read", method=RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Regist read Page Called~~");
		System.out.println("bno = " + bno);
		model.addAttribute(service.read(bno));
		return "/board/read2";  // read.jsp
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.GET)
	public String modifyGET(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Modify Page Called~~(GET)");
		model.addAttribute(service.read(bno));
		
		System.out.println("bno = " + bno);
		return "/board/modify5";  // modify.jsp
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		System.out.println("Modify Page Called~~ (POST)");
		
		System.out.println("bno = " + board.getBno());
		System.out.println("Title = " + board.getTitle());
		System.out.println("content = " + board.getContent());
		System.out.println("writer = " + board.getWriter());
		
		service.modify(board);
		
		return "redirect:/board/listAll";  // listAll로 redirect
	}
	
	@RequestMapping(value = "/remove", method=RequestMethod.GET)
	public String removeGET(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
		System.out.println("Remove Page Called~~(GET)");
		service.remove(bno);
		
		System.out.println("bno = " + bno);
		return "redirect:/board/listAll";  
	}
	
	@RequestMapping(value = "/listPage", method=RequestMethod.GET)
	public String listPage(Model model) throws Exception {
		System.out.println("List Page (GET) Called~~");
		model.addAttribute("list", service.listPage(3));
		return "/board/listAll";
	}
	
	@RequestMapping(value = "/listCriteria", method=RequestMethod.GET)
	public String listCriteria(Criteria cri, Model model) throws Exception {
		System.out.println("List Criteria (GET) Called~~");
		model.addAttribute("list", service.listPage(cri));
		return "/board/listAll";
	}
}
