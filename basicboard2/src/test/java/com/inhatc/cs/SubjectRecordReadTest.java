package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class SubjectRecordReadTest {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void testReadStudents() throws Exception {
		SubjectRecordVO vo = dao.readStudent("1234");
		System.out.println("---------------------read one test---------------------");
		System.out.println("학번 : " + vo.getStuID());
		System.out.println("국어 영어 수학 점수 : " + vo.getKor() + " / " + vo.getEng() + " / "+ vo.getMat());
		System.out.println("---------------------read one test---------------------");
	}
	
	@Test
	public void testAllList() throws Exception {
		System.out.println("---------------read list all test---------------");
		List<SubjectRecordVO> listStudents = dao.listAll();
		System.out.println("=============================");
		int nDataCount = listStudents.size();
		System.out.println("Data Count : " + nDataCount);
		for(int i = 0; i < nDataCount; i++) {
			System.out.println("------------------------------");
			System.out.println("Student Index : " + i);
			System.out.println("학 번  : " + listStudents.get(i).getStuID());
			System.out.println("국어 점수 : " + listStudents.get(i).getKor());
			System.out.println("영어 점수 : " + listStudents.get(i).getEng());
			System.out.println("수학 점수 : " + listStudents.get(i).getMat());
			System.out.println("------------------------------");
		}
		System.out.println("---------------read list all test---------------");
	}
}
