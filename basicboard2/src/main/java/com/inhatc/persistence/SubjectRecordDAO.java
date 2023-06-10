package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {
	public void createStudent(SubjectRecordVO vo) throws Exception;
	public SubjectRecordVO readStudent(String stuID);
	public List<SubjectRecordVO> listAll() throws Exception;
	public void updateStudent(SubjectRecordVO vo) throws Exception;
	public void deleteStudent(String stuID) throws Exception;

}
