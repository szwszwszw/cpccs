package com.wechat_small_program.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.myutils.HibernateUtils;
import com.wechat_small_program.entity.InformEntity;
import com.wechat_small_program.entity.NewsEntity;

/**
 * 微信小程序主页加载时，提供数据库操作服务
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class MainPageLoadService {
	private Session session;
	private Transaction transaction; 
	
	/**
	 * 从数据库返回新闻列表并按时间降序排序
	 * @return 新闻列表
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<NewsEntity> getNewsList(){
		ArrayList<NewsEntity> newsList = null;
		String hql="from NewsEntity order by date desc";
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			Query query=session.createQuery(hql);
			newsList=(ArrayList<NewsEntity>) query.list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}finally{
			session.close();
		}
		
		return newsList;
	}
	/**
	 * 从数据库返回公告列表并按时间降序排序
	 * @return 公告列表
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<InformEntity> getInformList(){
		ArrayList<InformEntity> informList=null;
		String hql="from InformEntity order by date desc";
		try {
			session=HibernateUtils.openSession();
			transaction=session.beginTransaction();
			Query query=session.createQuery(hql);
			informList=(ArrayList<InformEntity>) query.list();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}finally{
			session.close();
		}
		
		return informList;
	}
}
