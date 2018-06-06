package com.wechat_small_program.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.ErrorRecordPo;

/**
 * ΢��С������������б�ʱ�ṩ���ݿ��������
 * @author SZW
 * @date 2018��5��22��
 * @version 1.0 
 */
public class ErrorRecordService {
	private Session session;
	private Transaction transaction;
	private Query query;
	/**
	 * �����û�id�����ݿ��ȡ�����б�
	 * @param uid���û�id
	 * @return ��Ӧ�����б�
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
