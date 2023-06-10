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

public class Menu202144020DeleteTest {
	@Inject
	private Menu202144020DAO dao;
	
	@Test
	public void testDeletemembers() throws Exception {
		Menu202144020VO vo = new Menu202144020VO();
		dao.delete(2222);
		
	}
}