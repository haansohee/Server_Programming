package com.inhatc.cs;

import java.util.List;

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

public class Menu202144020ListTest {
	@Inject
	private Menu202144020DAO dao;
	
	@Test
	public void testAllList() throws Exception {
		System.out.println("---------------Test---------------");
		List<Menu202144020VO> listMenu = dao.listAll();
		System.out.println("=============================");
		int nDataCount = listMenu.size();
		System.out.println("Data Count : " + nDataCount);
		for(int i = 0; i < nDataCount; i++) {
			System.out.println("------------------------------");
			System.out.println("index : " + i);
			System.out.println("메뉴 아이디 : " + listMenu.get(i).getMenuID());
			System.out.println("메뉴 종류 : " + listMenu.get(i).getCategory());
			System.out.println("메뉴 이름 : " + listMenu.get(i).getName());
			System.out.println("메뉴 가격 : " + listMenu.get(i).getPrice());
			System.out.println("메뉴 열량 : " + listMenu.get(i).getCalorie());
			System.out.println("------------------------------");
		}
	}
}