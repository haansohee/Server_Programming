package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentInfoVO;

@Repository
public class StudentInfoDAOimpl implements StudentInfoDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";

	@Override
	public void createStudent(StudentInfoVO vo) throws Exception {
		sqlSession.insert(namespace+".insertStudents", vo);
		
	}


	@Override
	public StudentInfoVO readStudent(String stuID) throws Exception {
		return sqlSession.selectOne(namespace + ".selectStudents", stuID);
	}


	@Override
	public void updateStudent(StudentInfoVO vo) throws Exception {
		sqlSession.update(namespace+".updateStudents", vo); 
	}


	@Override
	public void deleteStudent(String stuID) throws Exception {
		sqlSession.delete(namespace + ".deleteStudents", stuID);
		
	}


	@Override
	public List<StudentInfoVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}	

}
