package com.wechat_small_program.entity;

import java.util.Date;

/**
 * 对应数据库中的“新闻（t_news_list）”表，用于hibernate中ORM映射
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class NewsEntity {
	private int id;
	private String title;
	private Date date;
	private String imagePath;
	private String content;
	private String author;
	public NewsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NewsEntity(int id, String title, Date date, String imagePath,
			String content, String author) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.imagePath = imagePath;
		this.content = content;
		this.author = author;
	}

	@Override
	public String toString() {
		return "NewsEntity [id=" + id + ", title=" + title + ", date=" + date
				+ ", imagePath=" + imagePath + ", content=" + content
				+ ", author=" + author + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
