package com.wechat_small_program.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.LoginEntity;
import com.wechat_small_program.entity.UserInfoEntity;

/**
 * 微信小程序登录时，提供数据库操作服务
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class LoginService {
	private Session session;
	private Transaction transaction;
	/**
	 * 读取登录表中的内容
	 * @return 返回一个登录信息列表
	 */
	@SuppressWarnings("unchecked")
	public List<LoginEntity> getLoginList(){
		List<LoginEntity> list = null;
		String hql="from LoginEntity";
		
		 try {
			 session = HibernateUtils.openSession();
			 transaction=session.beginTransaction();
			 Query query=session.createQuery(hql);
			 list =query.list();
			 transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		}finally{
			session.close();
		}
		return list;
	}
	
	/**
	 * 根据用户id读取用户的详细信息
	 * @param uid 用户id
	 * @return 返回该用户的详细信息实体封装
	 */
	public UserInfoEntity getUserInfo(String uid){
		UserInfoEntity userInfo=null;
		String hql="SELECT new UserInfoEntity(u.id,u.uid,u.name,u.sex,u.tel,u.college,u.birthday,u.hometown,u.email,qq) FROM UserInfoEntity u WHERE u.uid=:uid";
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			Query query=session.createQuery(hql);
			query.setParameter("uid", uid);
			userInfo=(UserInfoEntity)query.uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		}finally{
			
			session.close();
		}
		return userInfo;
	}
}
