package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.Menu202144020VO;

public interface Menu202144020DAO {
	public void insert(Menu202144020VO vo) throws Exception;
	public Menu202144020VO read(int menuID) throws Exception;
	public void update(Menu202144020VO vo) throws Exception;
	public void delete(int menuID) throws Exception;
	public List<Menu202144020VO> listAll() throws Exception;
}
