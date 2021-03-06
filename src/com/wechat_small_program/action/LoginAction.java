package com.wechat_small_program.action;

import java.util.Iterator;
import java.util.List;

import com.wechat_small_program.entity.LoginEntity;
import com.wechat_small_program.entity.UserInfoEntity;
import com.wechat_small_program.service.LoginService;

/**
 * 响应微信小程序端的登录请求
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class LoginAction {
	//请求参数
	private String uid;
	private String pwd;
	//响应参数
	private boolean isOK;
	private String msg;
	private UserInfoEntity userInfo;
	/**
	 * 执行业务操作
	 * @return 返回结果将作为result节点的执行依据
	 */
	public String login(){
		System.out.println(this.uid);
		
		
		
		LoginEntity loginEntity;
		//调用service层获取登录信息表
		List<LoginEntity> list = new LoginService().getLoginList();
		Iterator<LoginEntity> iterator=list.iterator();
		while(iterator.hasNext()){
			loginEntity=iterator.next();
			if(!loginEntity.getUid().equals(this.uid)){
				this.isOK=false;
				this.msg="用户名不存在！";
			}
			if(loginEntity.getUid().equals(this.uid)&&!loginEntity.getPwd().equals(this.pwd)){
				this.isOK=false;
				this.msg="密码有误，请重新输入！";
				break;
			}
			if(loginEntity.getUid().equals(this.uid)&&loginEntity.getPwd().equals(this.pwd)){
				this.isOK=true;
				this.msg="登录成功！";
				//调用service层获取用户详细信息
				this.userInfo=new LoginService().getUserInfo(this.uid);
				break;
			}
		}
		return "success";
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public UserInfoEntity getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoEntity userInfo) {
		this.userInfo = userInfo;
	}
}
