package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class StudentInfoInsertTest {
	@Inject
	private StudentInfoDAO dao;
	
	private String[] stuID = {"1234", "5678", "9101"};
	private String[] name = {"한소희", "강준식", "홍길동"};
	private int[] dept = {44, 69, 99};
	private String[] addr = {"인천", "서울", "부산"};
	private String[] phone = {"11-111", "22-222", "33-333"};
	private String[] email = {"123@naver.com", "234@inhatc.co.kr", "354@daum.net"};
		
	@Test
	public void testInsertStudent() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		System.out.println("=======================Insert Test=======================");
		for(int i = 0; i < stuID.length; i++) {
			vo.setStuID(stuID[i]);
			vo.setName(name[i]);
			vo.setDept(dept[i]);
			vo.setAddr(addr[i]);
			vo.setPhone(phone[i]);
			vo.setEmail(email[i]);
			
			dao.createStudent(vo);
		}
	}
}