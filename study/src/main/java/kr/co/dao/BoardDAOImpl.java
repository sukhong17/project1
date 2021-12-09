package kr.co.dao;

import org.apache.ibatis.session.SqlSession;

import kr.co.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO{
	private SqlSession sqlSession;
	

	@Override
	public void write(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("boardMapper.insert", boardVO);
	}

}
