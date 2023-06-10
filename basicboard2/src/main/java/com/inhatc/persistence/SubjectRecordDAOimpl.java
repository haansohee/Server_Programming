package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.SubjectRecordVO;

@Repository
public class SubjectRecordDAOimpl implements SubjectRecordDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	// mapper이름 정의 먼저 해 주기
	private static final String namespace = "com.inhatc.mapper.sbjrecordMapper";


	@Override
	public void createStudent(SubjectRecordVO vo) {
		sqlSession.insert(namespace+".insertStudents", vo);
		
	}

	@Override
	public SubjectRecordVO readStudent(String stuID) {
		return sqlSession.selectOne(namespace + ".readStudents", stuID);
	}
	
	@Override
	public List<SubjectRecordVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}

	@Override
	public void updateStudent(SubjectRecordVO vo) {
		sqlSession.update(namespace+".updateStudents", vo);		
	}

	@Override
	public void deleteStudent(String stuID) {
		sqlSession.delete(namespace + ".deleteStudents", stuID);
		
	}

}
