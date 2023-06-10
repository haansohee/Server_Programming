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

public class SubjectRecordUpdateTest {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void testUpdateStudents() throws Exception {
		SubjectRecordVO vo = new SubjectRecordVO();
		
		vo.setStuID("1112");
		vo.setKor(100);
		dao.updateStudent(vo);
		
		System.out.println("---------------------test---------------------");
	}
}
