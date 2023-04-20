package com.inhatc.cs;

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

public class SubjectRecordInsertTest {
	@Inject
	private SubjectRecordDAO dao;
	private String[] stuid = {"1234", "5678", "9101", "1112"};
	private int[] kor = {90, 48, 60, 79};
	private int[] eng = {100, 83, 50, 49};
	private int[] mat = {80, 49, 60, 89};
	
	@Test
	public void testInsertStudents() throws Exception {
		SubjectRecordVO vo = new SubjectRecordVO();
		
		for(int i = 0; i < stuid.length; i++) {
			vo.setStuID(stuid[i]);
			vo.setKor(kor[i]);
			vo.setMat(mat[i]);
			vo.setEng(eng[i]);
			dao.createStudent(vo);
		}
		
		System.out.println("---------------------test---------------------");
	}
}
