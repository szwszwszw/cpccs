package com.wechat_small_program.entity;

import java.util.Date;

/**
 * 对应数据库中的“发起比赛（t_launch_match_list）”表，用于hibernate中ORM映射
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class LaunchMatchEntity {
	private int id;
	private String title;
	private Date beginTime;
	private Date endTime;
	private String state;
	public LaunchMatchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LaunchMatchEntity(int id, String title, Date beginTime,
			Date endTime, String state) {
		super();
		this.id = id;
		this.title = title;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.state = state;
	}
	@Override
	public String toString() {
		return "LaunchMatchEntity [id=" + id + ", title=" + title
				+ ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", state=" + state + "]";
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
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
