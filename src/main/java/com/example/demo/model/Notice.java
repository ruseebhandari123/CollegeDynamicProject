package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String noticename;
	private String noticeimg;
	private int Status;  
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate adddate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNoticename() {
		return noticename;
	}

	public void setNoticename(String noticename) {
		this.noticename = noticename;
	}

	public String getNoticeimg() {
		return noticeimg;
	}

	public void setNoticeimg(String noticeimg) {
		this.noticeimg = noticeimg;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public LocalDate getAdddate() {
		return adddate;
	}

	public void setAdddate(LocalDate adddate) {
		this.adddate = adddate;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", noticename=" + noticename + ", noticeimg=" + noticeimg + ", Status=" + Status
				+ ", adddate=" + adddate + "]";
	}
	
}
