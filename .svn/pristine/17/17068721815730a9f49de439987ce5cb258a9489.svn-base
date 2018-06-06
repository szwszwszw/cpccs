package com.myutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

/**
 * 完成Hibernate工具类
 * 封装配置文件读取操作封装SessionFactory创建操作
 * 封装Session获得操作
 * @author SZW
 * @date 2018年5月23日
 * @version 1.0 
 */
public class HibernateUtils {
	private static SessionFactory sf;
	
	static{
		//加载配置
		Configuration conf=new Configuration().configure();
		//根据配置信息创建SessionFactory
		sf=conf.buildSessionFactory();
		//关闭虚拟机时释放资源
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				sf.close();
				System.out.println("关闭资源");
			}
		}));
	}
	
	/**
	 * 打开Sesion
	 * @return
	 */
	public static Session openSession(){
		Session session=sf.openSession();
		return session;
	}
	/**
	 * 获得当前session		
	 * @return
	 */
	public static Session getCurrentSession(){
		Session session=sf.getCurrentSession();
		return session;
	}
}
