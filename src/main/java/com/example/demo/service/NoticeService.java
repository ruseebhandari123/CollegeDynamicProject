package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Notice;

public interface NoticeService {
	
	
void addNotice(Notice notice);
List<Notice>getallnotice();



void deleteNotice(long id);
void updateNotice(Notice notice);
Notice getNoticeById(long id);




}
