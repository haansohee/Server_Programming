package com.inhatc.cs;

import java.util.List;

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

public class StudentInfoReadTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testReadStudents() throws Exception {
		StudentInfoVO vo = dao.readStudent("5678");
		System.out.println("=======================Select Test=======================");
		System.out.println("학번 : " + vo.getStuID());
		System.out.println("이름: " + vo.getName());
		System.out.println("학과 코드 : " + vo.getDept());
		System.out.println("주소 : " + vo.getAddr());
		System.out.println("핸드폰 : " + vo.getPhone());
		System.out.println("이메일 : " + vo.getEmail());
	}
}
