package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Notice;
import com.example.demo.repository.NoticeRepository;
import com.example.demo.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	public NoticeRepository Noticerepo;
	
	@Override
	public void addNotice(Notice notice) {
		Noticerepo.save(notice);
	}

	@Override
	public List<Notice> getallnotice() {
		return Noticerepo.findAll();
	}
	@Override
	public void deleteNotice(long id) {
		Noticerepo.deleteById(id);		
	}
	@Override
	public void updateNotice(Notice notice) {
		Noticerepo.save(notice);	
	}
	@Override
	public Notice getNoticeById(long id) {
		return Noticerepo.findById(id).get();
	}


}
