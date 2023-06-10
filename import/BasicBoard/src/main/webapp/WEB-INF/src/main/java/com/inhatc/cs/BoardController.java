package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	private BoardService service;
	
	// /board/register
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerGET(BoardVO vo, Model model) throws Exception{
		System.out.println("Called Register Page (GET) ");
		return "/board/register";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO vo, RedirectAttributes rttr) throws Exception{
		System.out.println("Called Register Page (POST) ");
		service.regist(vo);
		return "redirect:/board/listAll";
	}
	
	// /board/listAll
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		System.out.println("Called listAll Page (GET) ");
		model.addAttribute("list", service.listAll());
		
		int i = 11;
		int j = 10;
		double temp = (double)i/j;
		
		System.out.println("temp: "+ temp);
		return "/board/listAll7"; //listAll7.jsp
	}
	
	// /board/read
		@RequestMapping(value="/read", method = RequestMethod.GET)
		public String read(@RequestParam("bno")int bno, Model model) throws Exception{
			System.out.println("Called Read Page (GET) ");
			System.out.println("bno = " + bno );
			model.addAttribute(service.read(bno));
			return "/board/read7";//read7.jsp
		}
		
		// /board/modify
		@RequestMapping(value="/modify", method = RequestMethod.GET)
		public String modifyGET(@RequestParam("bno")int bno, Model model) throws Exception{
			System.out.println("Called Modify Page (GET) ");
			model.addAttribute(service.read(bno));
			System.out.println("bno = " + bno );
			return "/board/modify5";//modify5.jsp
		}

		// /board/modify
		@RequestMapping(value="/modify", method = RequestMethod.POST)
		public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
			System.out.println("Called Modify Page (POST) ");
			System.out.println("bno = " + board.getBno() );
			System.out.println("Title = " + board.getTitle() );
			System.out.println("Content = " + board.getContent() );
			System.out.println("Writer = " + board.getWriter() );
			service.modify(board);			
			return "redirect:/board/listAll";
		}

		// /board/modify
		@RequestMapping(value="/remove", method = RequestMethod.GET)
		public String removeGET(@RequestParam("bno")int bno, RedirectAttributes rttr) throws Exception{
			System.out.println("Called Remove Page (GET) ");
			service.remove(bno);
			System.out.println("bno = " + bno );
			return "redirect:/board/listAll";
		}
		
		@RequestMapping(value = "/listPage", method = RequestMethod.GET)
		  public String listPage( @ModelAttribute("cri") Criteria cri, Model model) throws Exception {

			//int nTotalCount = service.countPaging(); //3046
			//double dTotalPage = nTotalCount/(double)10 ; //304.6
			
			//System.out.println("nTotalCount = " + nTotalCount );
			//System.out.println("dTotalPage = " + dTotalPage );
		    //model.addAttribute("list", service.listPage(3));
			model.addAttribute("list", service.listPage(cri));
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			pageMaker.setTotalCount(service.countPaging());
			model.addAttribute("pageMaker", pageMaker);

		    return "/board/listPage"; //listPage.jsp
		  }
		
		// /board/readPage
		@RequestMapping(value="/readPage", method = RequestMethod.GET)
		public String readPage(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri, 
				Model model) throws Exception{
			System.out.println("Called ReadPage Page (GET) ");
			System.out.println("bno = " + bno );
			model.addAttribute(service.read(bno));
			return "/board/readPage";//readPage.jsp
		}
		
		
		// /board/modifyPage
		@RequestMapping(value="/modifyPage", method = RequestMethod.GET)
		public String modifyPageGET(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri,
				Model model) throws Exception{
			System.out.println("Called ModifyPage Page (GET) ");
			model.addAttribute(service.read(bno));
			System.out.println("bno = " + bno );
			return "/board/modifyPage";//modify5.jsp
		}
		
		// /board/modifyPage
		@RequestMapping(value="/modifyPage", method = RequestMethod.POST)
		public String modifyPagePOST(BoardVO board, @ModelAttribute("cri") Criteria cri, 
				RedirectAttributes rttr) throws Exception{
			System.out.println("Called ModifyPage Page (POST) ");
			
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			service.modify(board);			
			return "redirect:/board/listPage";
		}

		// /board/removePage
		@RequestMapping(value="/removePage", method = RequestMethod.POST)
		public String removePageGET(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri,
				RedirectAttributes rttr) throws Exception{
			System.out.println("Called RemovePage Page (GET) ");
			service.remove(bno);
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			return "redirect:/board/listPage";
		}
		
}
