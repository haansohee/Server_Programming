package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.Menu202144020VO;
import com.inhatc.persistence.Menu202144020DAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class Menu202144020InsertTest {
	@Inject
	private Menu202144020DAO dao;
	private int[] menuID = {1111, 2222, 3333, 4444};
	private String[] category = {"한식", "중식", "일식", "양식"};
	private String[] name = {"비빔밥", "짜장면", "초밥", "파스타"};
	private int[] price = {6000, 5000, 8000, 10000};
	private int[] calorie = {400, 600, 450, 700};
	
	@Test
	public void testInsertMenu() throws Exception {
		Menu202144020VO vo = new Menu202144020VO();
		
		System.out.println("---------------------insert test---------------------");
		
		for(int i = 0; i < menuID.length; i++) {
			vo.setMenuID(menuID[i]);
			vo.setCategory(category[i]);
			vo.setName(name[i]);
			vo.setPrice(price[i]);
			vo.setCalorie(calorie[i]);
			dao.insert(vo);
		}
		
		System.out.println("---------------------insert test finish---------------------");
	}
}
