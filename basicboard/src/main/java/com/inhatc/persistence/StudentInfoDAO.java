package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	public void createStudent(StudentInfoVO vo) throws Exception;
	public StudentInfoVO readStudent(String stuID) throws Exception;
	public List<StudentInfoVO> listAll() throws Exception;
	public void updateStudent(StudentInfoVO vo) throws Exception;
	public void deleteStudent(String stuID) throws Exception;

}
