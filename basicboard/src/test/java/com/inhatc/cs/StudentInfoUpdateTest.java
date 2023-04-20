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

public class StudentInfoUpdateTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testUpdateStudents() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		System.out.println("=======================Update Test=======================");
		vo.setStuID("1234");
		vo.setName("담곰이");
		vo.setAddr("강원도");
		vo.setDept(89);
		vo.setEmail("damgom@inhatc.ac.kr");
		vo.setPhone("44-4444");
				
		dao.updateStudent(vo);
		
		StudentInfoVO vo2 = dao.readStudent("1234");
		System.out.println("수정된 1234 학번의 학생 데이터 ----->>>>" + vo2.getName() + vo2.getAddr() + vo2.getDept() + vo2.getEmail() + vo2.getPhone());
	}
}