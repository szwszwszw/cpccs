package com.wechat_small_program.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.wechat_small_program.service.ChangeUserInfoService;

/**
 * ��ӦС�����޸ĸ�����Ϣ����
 * @author SZW
 * @date 2018��5��24��
 * @version 1.0 
 */
public class ChangeUserInfoAction {
	//�������
	private String uid;
	private String name;
	private String sex;
	private String tel;
	private String college;
	private String birthday;
	private String hometown;
	private String email;
	private String qq;
	//��Ӧ����
	private boolean OK;
	private String msg;
	
	public String changeUserInfo(){
		Date birthday=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		try {
			//�ַ���ת����
			birthday=sdf.parse(this.birthday);
		} catch (Exception e) {
			System.out.println(e);
		}
		//����service������û���Ϣ
		this.OK=new ChangeUserInfoService().updataUserInfo(uid, name, sex, tel, college, birthday, hometown, email,qq);
		if(OK){
			msg="�޸ĳɹ���";
		}else if(!OK){
			msg="��������æ�����Ժ����ԣ�";
		}
		return "success";
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isOK() {
		return OK;
	}
	public void setOK(boolean oK) {
		OK = oK;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	
}
