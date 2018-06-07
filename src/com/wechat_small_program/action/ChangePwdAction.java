package com.wechat_small_program.action;

import com.wechat_small_program.service.ChangePwdService;

/**
 * 响应微信小程序修改密码请求
 * @author SZW
 * @date 2018年6月7日
 * @version 1.0 
 */
public class ChangePwdAction {
	//请求参数
	private String uid;
	private String oldPwd;
	private String newPwd;
	//响应参数
	private boolean isOK;
	private String msg;
	
	/**
	 * 执行修改密码
	 * @return
	 */
	public  String changePwd(){
		ChangePwdService change=new ChangePwdService();
		if(change.pwdIsRight(this.uid, this.oldPwd)){
			if(change.updatePwd(this.newPwd)){
				this.isOK=true;
				this.msg="恭喜，修改成功！";
			}else {
				this.isOK=false;
				this.msg="服务器开小差了，请稍后再试";
			}
		}else {
			this.isOK=false;
			this.msg="您输入的原密码有误！";
		}
		return "success";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public boolean isOK() {
		return isOK;
	}

	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
