package com.wechat_small_program.service;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.ErrorEntity;
import com.wechat_small_program.entity.MatchEntity;

/**
 * 微信小程序答题结果提交页面，提供数据库操作服务
 * @author SZW
 * @date 2018年6月1日
 * @version 1.0 
 */
public class SubmitAnswerResultService {
	private Session session;
	private Transaction transaction;
	//private Query query;
	private String uid;
	private String[] wrongId;
	private String[] wrongOp;
	private String time;
	private String score;
	/**
	 * 构造函数，初始化基本信息
	 * @param uid
	 * @param wrongId
	 * @param wrongOp
	 * @param time
	 */
	public SubmitAnswerResultService(String uid, String[] wrongId,
			String[] wrongOp, String time,String score) {
		super();
		this.uid = uid;
		this.wrongId = wrongId;
		this.wrongOp = wrongOp;
		this.time = time;
		this.score=score;
	}
	/**
	 * 执行存储操作
	 * @return 成功返回true,否则返回false
	 */
	public boolean save(){
		boolean ok=false;
		if(saveGrade()){
			if(saveError()){
				ok=true;
			}else{
				ok=false;
			}
		}else{
			ok=false;
		}
		return ok;
	}
	/**
	 * 将成绩信息存储到t_match_list表中
	 * @return 成功返回true,否则返回false
	 */
	private boolean saveGrade(){
		boolean ok=false;
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			MatchEntity match=new MatchEntity();
			match.setUid(this.uid);
			match.setGrade(this.score);
			match.setTime(this.time);
			session.save(match);
			transaction.commit();
			ok=true;
		} catch (Exception e) {
			ok=false;
			transaction.rollback();
		}finally{
			session.close();
		}		
		return ok;
	}
	/**
	 * 将错题记录存储到t_error_list表中
	 * @return 成功返回true,否则返回false
	 */
	private boolean saveError(){
		boolean ok=false;
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			for(int i=0;i<this.wrongId.length;i++){
				ErrorEntity error=new ErrorEntity();
				error.setUid(this.uid);
				error.setError_id(Integer.parseInt(this.wrongId[i]));
				error.setErroChoose(this.wrongOp[i]);
				session.save(error);
			}
			transaction.commit();
			ok=true;
		} catch (Exception e) {
			ok=false;
			transaction.rollback();
		}finally{
			session.close();
		}
		return ok;
	}
}
