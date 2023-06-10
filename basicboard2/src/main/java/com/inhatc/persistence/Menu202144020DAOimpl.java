package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Menu202144020VO;

@Repository
public class Menu202144020DAOimpl implements Menu202144020DAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.Menu202144020Mapper";

	@Override
	public void insert(Menu202144020VO vo) throws Exception {
		sqlSession.insert(namespace + ".insertMenu", vo);
	}

	@Override
	public Menu202144020VO read(int menuID) throws Exception {
		return sqlSession.selectOne(namespace + ".selectMenu", menuID);
	}

	@Override
	public void update(Menu202144020VO vo) throws Exception {
		sqlSession.update(namespace + ".updateMenu", vo);
	}

	@Override
	public void delete(int menuID) throws Exception {
		sqlSession.delete(namespace + ".deleteMenu", menuID);
	}

	@Override
	public List<Menu202144020VO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

}
