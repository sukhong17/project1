package kr.co.service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;

public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

}