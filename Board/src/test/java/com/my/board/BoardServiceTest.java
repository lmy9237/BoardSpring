package com.my.board;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.dao.BoardDao;
import com.my.dto.BoardDto;
import com.my.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardServiceTest {
	@Autowired
	BoardService svc;

	@Test
	public void testGetAllList() throws Exception {
		ArrayList<BoardDto> list1 = svc.getBoardListByPageNumber(1);
		for (BoardDto dto : list1) {
			System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent() + " / " + dto.getWriter() + " / " + dto.getWritedate() + " / " + dto.getHitcount());
		}
	}
	@Test
	public void testGetLastPageNumber() throws Exception {
		System.out.println("마지막 페이지번호 : " + svc.getLastPageNumber());
	}
	
	@Test
	public void testGetBoardDetail() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("글번호 입력 : ");
		int bno = sc.nextInt();
		BoardDto dto = svc.getBoardDetail(bno);
		System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent() + " / " + dto.getWriter() + " / " + dto.getWritedate() + " / " + dto.getHitcount());
	}
	
	@Test
	public void testincreaseHitcount() throws Exception {
		svc.increaseHitcount(1);
	}

	@Test
	public void testWriteBoard() throws Exception {
		BoardDto dto = new BoardDto(0,"my","제목2f2","안녕하세요",0,null);
		svc.writeBoard(dto);
	}
	@Test
	public void testUpdateBoard() throws Exception {
		svc.updateBoard(2,"수정이3","되겠죠?3");
	}
	@Test
	public void testDeleteBoard() throws Exception {
		svc.deleteBoard(3);
	}
}
