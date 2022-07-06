package com.githrd.web.dao;

import java.util.List;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.githrd.web.vo.MemberVO;

public class MemberDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int getLogin(MemberVO mVO) {
		return sqlSession.selectOne("mSQL.login", mVO);
	}

	
}