
package com.inhatc.cs;

import javax.inject.Inject;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class BoardDAOReadTest {
   @Inject
   private BoardDAO dao;
   
   @Test
   public void readBoard() throws Exception{
	   System.out.println("---------------test----------------");
	   BoardVO vo = dao.read(1);
	   System.out.println("Title: "+vo.getTitle());
	   System.out.println("Writer "+vo.getWriter());
	   System.out.println("-----------------------------------");
   }
 
  
   
}