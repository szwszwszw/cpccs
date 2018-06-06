package com.wechat_small_program.service;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;


/**
 * 微信小程序修改个人信息时，提供数据库更新服务
 * @author SZW
 * @date 2018年5月24日
 * @version 1.0 
 */
public class ChangeUserInfoService {
	private  Session session;
	private Transaction transaction;
	
	public boolean updataUserInfo(String uid,String name,String sex,
			String tel,String college,Date birthday,String hometown,String email,String qq){
		boolean OK=false;
		String hql="update UserInfoEntity u set u.uid=:uid,u.name=:name,u.sex=:sex,u.tel=:tel,u.college=:college,"
				+ "u.birthday=:birthday,u.hometown=:hometown,u.email=:email,u.qq=:qq where u.uid=:uid";
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			Query queryUpdate=session.createQuery(hql);
			queryUpdate.setParameter("uid", uid);
			queryUpdate.setParameter("name", name);
			queryUpdate.setParameter("sex", sex);
			queryUpdate.setParameter("tel", tel);
			queryUpdate.setParameter("college", college);
			queryUpdate.setParameter("birthday", birthday);
			queryUpdate.setParameter("hometown", hometown);
			queryUpdate.setParameter("email", email);
			queryUpdate.setParameter("qq", qq);
			queryUpdate.executeUpdate();
			transaction.commit();
			OK=true;
		} catch (Exception e) {
			transaction.rollback();
			OK=false;
			System.out.println(e);
		}finally{
			session.close();
		}
		return OK;
	}
}
