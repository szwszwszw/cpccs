package com.wechat_small_program.action;

import java.util.Iterator;
import java.util.List;

import com.wechat_small_program.entity.LoginEntity;
import com.wechat_small_program.entity.UserInfoEntity;
import com.wechat_small_program.service.LoginService;

/**
 * ��Ӧ΢��С����˵ĵ�¼����
 * @author SZW
 * @date 2018��5��22��
 * @version 1.0 
 */
public class LoginAction {
	//�������
	private String uid;
	private String pwd;
	//��Ӧ����
	private boolean isOK;
	private String msg;
	private UserInfoEntity userInfo;
	/**
	 * ִ��ҵ�����
	 * @return ���ؽ������Ϊresult�ڵ��ִ������
	 */
	public String login(){
		LoginEntity loginEntity;
		//����service���ȡ��¼��Ϣ��
		List<LoginEntity> list = new LoginService().getLoginList();
		Iterator<LoginEntity> iterator=list.iterator();
		while(iterator.hasNext()){
			loginEntity=iterator.next();
			if(!loginEntity.getUid().equals(this.uid)){
				this.isOK=false;
				this.msg="�û��������ڣ�";
			}
			if(loginEntity.getUid().equals(this.uid)&&!loginEntity.getPwd().equals(this.pwd)){
				this.isOK=false;
				this.msg="�����������������룡";
				break;
			}
			if(loginEntity.getUid().equals(this.uid)&&loginEntity.getPwd().equals(this.pwd)){
				this.isOK=true;
				this.msg="��¼�ɹ���";
				//����service���ȡ�û���ϸ��Ϣ
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