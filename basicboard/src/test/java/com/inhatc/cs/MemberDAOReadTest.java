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

public class MemberDAOReadTest {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void readMembers() throws Exception {
		MembersVO vo = dao.readMembers("userID 1");
		System.out.println("---------------------test---------------------");
		System.out.println("User Name : " + vo.getUsername());
		System.out.println("User Email : " + vo.getEmail());
		System.out.println("---------------------test---------------------");
	}
	
	@Test
	public void readWithPW() throws Exception {
		MembersVO vo = dao.readWithPW("userID 1", "pw 1");
		System.out.println("---------------------test---------------------");
		System.out.println("User id : " + vo.getUserid());
		System.out.println("User password : " + vo.getUserpw());
		System.out.println("---------------------test---------------------");
		
	}
}