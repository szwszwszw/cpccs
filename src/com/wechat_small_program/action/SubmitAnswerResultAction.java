package com.wechat_small_program.action;

import com.wechat_small_program.service.SubmitAnswerResultService;

/**
 * 用户提交答题结果
 * @author SZW
 * @date 2018年6月1日
 * @version 1.0 
 */
public class SubmitAnswerResultAction {
	//请求参数
	private String uid;
	private String wrongId;
	private String wrongOp;
	private String time;
	private String score;
	//响应参数
	private String msg;
	private boolean isOk;

	/**
	 * 执行将提交结果保存到数据库的响应
	 * @return
	 */
	public String saveResult(){
		SubmitAnswerResultService service=new SubmitAnswerResultService(uid, wrongId.split(","), wrongOp.split(","), time,score);
		if(service.save()){
			this.isOk=true;
			this.msg="提交成功";
		}else{
			this.isOk=false;
			this.msg="服务器开小差啦";
		}
		return "success";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getWrongId() {
		return wrongId;
	}

	public void setWrongId(String wrongId) {
		this.wrongId = wrongId;
	}

	public String getWrongOp() {
		return wrongOp;
	}

	public void setWrongOp(String wrongOp) {
		this.wrongOp = wrongOp;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
}
