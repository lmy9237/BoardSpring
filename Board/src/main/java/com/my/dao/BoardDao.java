package com.my.dao;

import java.util.ArrayList;

import com.my.dto.BoardDto;

public interface BoardDao {
	ArrayList<BoardDto> getAllList(int pageNum);
	int getCountAll();// ������ ������ ��ȣ�� ����
	void increaseHitcount(int bno); // ��ȸ�� �ø���
	BoardDto selectOneBoard(int bno);
	void write(BoardDto dto); // �۾���
	void update(int bno, String title, String content);  // �����ϱ�
	void delete(int bno); //�����ϱ�
}