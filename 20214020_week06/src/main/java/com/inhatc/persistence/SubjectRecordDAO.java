package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {
	public void createStudent(SubjectRecordVO vo);
	public SubjectRecordVO readStudent(String stuID);
	public List<SubjectRecordVO> listAll() throws Exception;
	public void updateStudent(SubjectRecordVO vo);
	public void deleteStudent(String stuID);

}
