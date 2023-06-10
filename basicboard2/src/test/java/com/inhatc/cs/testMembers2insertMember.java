package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class testMembers2insertMember {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testInsertMember() throws Exception {
		MembersVO vo = new MembersVO();
		vo.setUserid("userID 3");
		vo.setUserpw("pw 3");
		vo.setUsername("Name 3");
		vo.setEmail("sjlk@itc.ac.kr");
		dao.insertMember(vo);
		System.out.println("---------------------test---------------------");
	}
}