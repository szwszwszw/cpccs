package com.wechat_small_program.entity;

/**
 * 对应数据库中的“学习情况（t_study）”表，用于hibernate中ORM映射
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class StudyEntity {
	private int id;
	private String uid;
	private int finishedId;
	public StudyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudyEntity(int id, String uid, int finishedId) {
		super();
		this.id = id;
		this.uid = uid;
		this.finishedId = finishedId;
	}
	@Override
	public String toString() {
		return "StudyEntity [id=" + id + ", uid=" + uid + ", finishedId="
				+ finishedId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getFinishedId() {
		return finishedId;
	}
	public void setFinishedId(int finishedId) {
		this.finishedId = finishedId;
	}
	
}
