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

public class StudentInfoListTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testAllList() throws Exception {
		System.out.println("---------------Test---------------");
		List<StudentInfoVO> listStudent = dao.listAll();
		System.out.println("=============================");
		int nDataCount = listStudent.size();
		System.out.println("Data Count : " + nDataCount);
		for(int i = 0; i < nDataCount; i++) {
			System.out.println("------------------------------");
			System.out.println("index : " + i);
			System.out.println("학생 학번 : " + listStudent.get(i).getStuID());
			System.out.println("학생 이름 : " + listStudent.get(i).getName());
			System.out.println("학생 학과 코드 : " + listStudent.get(i).getDept());
			System.out.println("학생 이메일 : " + listStudent.get(i).getEmail());
			System.out.println("학생 폰 번호 : " + listStudent.get(i).getPhone());
			System.out.println("------------------------------");
		}
	}
}