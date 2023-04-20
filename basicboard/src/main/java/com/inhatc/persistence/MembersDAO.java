package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MembersVO;

public interface MembersDAO {
	
	public String getTime();  // getTime 구현하기 -> class 생성 > MembersDAOimpl.java
	public void insertMember(MembersVO vo);
	
	public MembersVO readMembers(String userid) throws Exception;
	public MembersVO readWithPW(String userid, String userpw) throws Exception;
	public void modify(MembersVO vo) throws Exception;
	public void remove(String userid) throws Exception;
	public List<MembersVO> listAll() throws Exception;
}
