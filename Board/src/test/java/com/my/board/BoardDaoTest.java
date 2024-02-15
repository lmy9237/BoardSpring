package com.my.board;

import java.sql.Connection; 
import java.util.ArrayList;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.dao.BoardDao;
import com.my.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoTest {
	@Autowired
	BoardDao dao; //root-context에 등록한 '빈'을 자동주입
	
	@Test
	public void testGetAllList() throws Exception{
		ArrayList<BoardDto> list1 = dao.getAllList(1);
		for(BoardDto dto : list1) {
			System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent() + " / " + dto.getWriter() + " / " + dto.getWritedate() + " / " + dto.getHitcount());
		}
	}
	
	@Test
	public void testSelectAll() throws Exception{
		System.out.println("All : " + dao.getCountAll());
	}
	@Test
	public void testSelectOneBoard() throws Exception{
		BoardDto dto = dao.selectOneBoard(1); //1번째 글 출력
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		System.out.println(dto.getWriter());
	}
	@Test
	public void testIncreaseHitcount() throws Exception{
		dao.increaseHitcount(1);
	}
	@Test
	public void testWriteBoard() throws Exception{
		BoardDto dto = new BoardDto(0,"민영","타이틀","안녕하세요",0,null);
		dao.write(dto);
	}
	@Test
	public void testUpdateBoard() throws Exception{
		dao.update(2,"수정이","되겠죠?");
	}
	@Test
	public void testDeleteBoard() throws Exception{
		dao.delete(2);
	}
}
