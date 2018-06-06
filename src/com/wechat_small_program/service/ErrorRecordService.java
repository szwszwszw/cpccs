package com.wechat_small_program.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.ErrorRecordPo;

/**
 * 微信小程序请求错题列表时提供数据库操作服务
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class ErrorRecordService {
	private Session session;
	private Transaction transaction;
	private Query query;
	/**
	 * 根据用户id从数据库读取错题列表
	 * @param uid：用户id
	 * @return 对应错题列表
	 */
	@SuppressWarnings("unchecked")
	public List<ErrorRecordPo> getErrorRecordList(String uid){
		List<ErrorRecordPo> list=null;
		String hql="SELECT new com.wechat_small_program.entity.ErrorRecordPo(qb.question,qb.answer,e.erroChoose,qb.A,qb.B,"
				+ " qb.C,qb.D) FROM QuestionBankEntity as qb,ErrorEntity as e WHERE e.error_id=qb.id"
				+ " AND e.uid=:uid" ;
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			query=session.createQuery(hql);
			query.setParameter("uid", uid);
			list=(ArrayList<ErrorRecordPo>)query.list();
			System.out.println(list);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		}finally{
			session.close();
		}
		return list;
	}
}
