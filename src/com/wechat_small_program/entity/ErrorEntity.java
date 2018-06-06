package com.wechat_small_program.entity;

/**
 * 对应数据库中的“错题记录（t_error_list）”表，用于hibernate中ORM映射
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class ErrorEntity {
	private int id;
	private String uid;
	private int error_id;
	private String erroChoose;
	public ErrorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorEntity(int id, String uid, int error_id, String erroChoose) {
		super();
		this.id = id;
		this.uid = uid;
		this.error_id = error_id;
		this.erroChoose = erroChoose;
	}

	@Override
	public String toString() {
		return "ErrorEntity [id=" + id + ", uid=" + uid + ", error_id="
				+ error_id + ", erroChoose=" + erroChoose + "]";
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
	public int getError_id() {
		return error_id;
	}
	public void setError_id(int error_id) {
		this.error_id = error_id;
	}
	public String getErroChoose() {
		return erroChoose;
	}
	public void setErroChoose(String erroChoose) {
		this.erroChoose = erroChoose;
	}
	
}
