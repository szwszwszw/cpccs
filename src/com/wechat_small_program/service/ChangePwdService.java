package com.wechat_small_program.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.LoginEntity;

/**
 * 为微信小程序修改密码提供数据库操作服务
 * @author SZW
 * @date 2018年6月7日
 * @version 1.0 
 */
public class ChangePwdService {
	private Session session;
	@SuppressWarnings("unused")
	private Transaction transaction;
	private Query query;
	@SuppressWarnings("unused")
	private LoginEntity user;
	
	public ChangePwdService(){
		this.session=HibernateUtils.openSession();
		this.transaction=this.session.beginTransaction();
	}
	
	/**
	 * 判断用户原密码是否正确
	 * @param uid 用户id
	 * @param pwd 原始密码
	 * @return 正确返回true 错误返回false
	 */
	public boolean pwdIsRight(String uid,String oldPwd){
		String hql="FROM LoginEntity u WHERE u.uid=:uid";
		this.query=this.session.createQuery(hql);
		query.setParameter("uid", uid);
		this.user=(LoginEntity) query.list().get(0);
		if(this.user.getPwd().equals(oldPwd)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * 更新为新密码
	 * @param newPwd
	 * @return
	 */
	public boolean updatePwd(String newPwd){
		boolean ok=false;
		try {
			this.user.setPwd(newPwd);
			this.session.update(this.user);
			this.transaction.commit();
			ok=true;
		} catch (Exception e) {
			this.transaction.rollback();
			System.out.println(e);
			ok=false;
		}finally{
			this.session.close();
		}
		return ok;
	}
}
