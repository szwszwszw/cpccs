package com.wechat_small_program.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.QuestionBankEntity;

/**
 * 微信小程序学习页面，请求题目列表时提供数据库操作服务
 * @author SZW
 * @date 2018年6月7日
 * @version 1.0 
 */
public class StudyListService {
	private Session session;
	private Transaction transaction;
	private Query query;
	private int[] id;	//存放题目id的数组
	private int length=10;	//随机的题目数
	
	/**
	 * 生成不重复的length个随机题库id
	 */
	@SuppressWarnings("unchecked")
	private void randomId(){
		int i;
		int j;
		Random random=new Random();
		List<QuestionBankEntity> list=query.list();
		i=list.size();
		id=new int[this.length];
		for(int k=0;k<this.length;k++){
			while(true){
				j=random.nextInt(i)+1;
				if(!hava(id, j)){
					break;
				}
			}
			id[k]=j;
			//System.out.println(id[k]);
		}
		//升序排序
		Arrays.sort(id);
	}
	/**
	 * 判断一个整形数组中是否存在一个数
	 * @param arry：目标数组
	 * @param j：目标数
	 * @return 存在返回true不存在返回false
	 */
	private boolean hava(int[] arry,int j){
		boolean hava=false;
		for(int i=0;i<arry.length;i++){
			if(arry[i]==j){
				hava=true;
				break;
			}
		}
		return hava;
	}
	/**
	 * 从数据库返回随机的length道题
	 * @return 返回题目数组
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<QuestionBankEntity> getQuestionList(){
		ArrayList<QuestionBankEntity> questionList=new ArrayList<QuestionBankEntity>();
		String hql="from QuestionBankEntity";
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			query=session.createQuery(hql);
			randomId();
			Iterator<QuestionBankEntity> iterator=query.list().iterator();
			int index=0;
			while(iterator.hasNext()){
				QuestionBankEntity temp=iterator.next();
				if(temp.getId()==this.id[index]){
					questionList.add(temp);
					index++;	
				}
			}
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
		}finally{
			session.close();
		}
		return questionList;
	}
	
}
