package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;

@Repository
public class MembersDAOimpl implements MembersDAO {

	@Inject
	private SqlSession sqlSession;
	
	// mapper이름 정의 먼저 해 주기
	private static final String namespace = "com.inhatc.mapper.sbjrecordMapper";

	@Override
	public void insertMember(MembersVO vo) {
		sqlSession.insert(namespace+".insertMembers", vo);
		
	}


	@Override
	public MembersVO readMembers(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".selectMembers", userid);
	}
	
	@Override
	public MembersVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return sqlSession.selectOne(namespace + ".selectWithPW", paramMap);
	}

	@Override
	public void modify(MembersVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo); 
	}


	@Override
	public void remove(String userid) throws Exception {
		sqlSession.delete(namespace + ".delete", userid);
		
	}


	@Override
	public List<MembersVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}


	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
