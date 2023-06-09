package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardDAOTest {

  @Inject
  private BoardDAO dao;

  private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

  @Test
  public void testCreate() throws Exception {

    BoardVO board = new BoardVO();
    board.setTitle("제목2");
    board.setContent("내용2");
    board.setWriter("user01");
    dao.create(board);
  }

  @Test
  public void testRead() throws Exception {

	  System.out.println(dao.read(1).toString());
  }

  @Test
  public void testUpdate() throws Exception {

    BoardVO board = new BoardVO();
    board.setBno(1);
    board.setTitle("제목 업데이트.");
    board.setContent("내용업데이트");
    dao.update(board);
  }

  @Test
  public void testDelete() throws Exception {

    dao.delete(3);
  }

  
}
