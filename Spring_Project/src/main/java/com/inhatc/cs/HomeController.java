package com.inhatc.cs;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 지시자 역할 (나는 컨트롤러입미다..)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)  // 사용자의 요청을 맵핑. 요청한 value 가 root! 엇.. root 나네? 나를 요청한거네?
																// get방식으로 요청..
	public String home(Locale locale, Model model) { // home이라는 메서드를 처리 
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";  // home이라는 문자열 return ->  servlet-context.xml(중요 파일)
	}
	
	@RequestMapping(value = "/sum", method = RequestMethod.GET)  // 사용자의 요청을 맵핑. 요청한 value 가 root! 엇.. root 나네? 나를 요청한거네?
	// get방식으로 요청..
	public String sum(Locale locale, Model model) { // home이라는 메서드를 처리 
			logger.info("Welcome home! The client locale is {}.", locale);

			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

			String formattedDate = dateFormat.format(date);

			model.addAttribute("serverTime", formattedDate );

			return "sum";  // home이라는 문자열 return ->  servlet-context.xml(중요 파일)
}
	@RequestMapping(value = "/gugudan", method = RequestMethod.GET)
	public String gugudan(Locale locale, Model model) { // home이라는 메서드를 처리 
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "gugudan";  // home이라는 문자열 return ->  servlet-context.xml(중요 파일)
}
	@RequestMapping(value = "/prime", method = RequestMethod.GET)
	public String prime(Locale locale, Model model) { // home이라는 메서드를 처리 
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "prime";  // home이라는 문자열 return ->  servlet-context.xml(중요 파일)
}
	@RequestMapping(value = "/lotto", method = RequestMethod.GET)
	public String lotto(Locale locale, Model model) { // home이라는 메서드를 처리 
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "lotto";  // home이라는 문자열 return ->  servlet-context.xml(중요 파일)
}
	
}
