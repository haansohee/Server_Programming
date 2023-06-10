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

public class Menu202144020ReadTest {
	@Inject
	private Menu202144020DAO dao;
	
	@Test
	public void testRead() throws Exception {
		Menu202144020VO vo = dao.read(1111);
		System.out.println("---------------------read one test---------------------");
		System.out.println("메뉴 아이디 : " + vo.getMenuID());
		System.out.println("종류 / 이름 / 가격 /열량 : " + vo.getCategory() + " / " + vo.getName() + " / "+ vo.getPrice() + " / " + vo.getCalorie());
		System.out.println("---------------------read one test---------------------");
	}
	
}
