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

public class StudentInfoDeleteTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testDeletemembers() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		dao.deleteStudent("9101");
		
		System.out.println("학번 9101 학생 데이터 : " + dao.readStudent("9101"));
	}
}