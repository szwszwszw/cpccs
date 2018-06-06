package com.myutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

/**
 * ���Hibernate������
 * ��װ�����ļ���ȡ������װSessionFactory��������
 * ��װSession��ò���
 * @author SZW
 * @date 2018��5��23��
 * @version 1.0 
 */
public class HibernateUtils {
	private static SessionFactory sf;
	
	static{
		//��������
		Configuration conf=new Configuration().configure();
		//����������Ϣ����SessionFactory
		sf=conf.buildSessionFactory();
		//�ر������ʱ�ͷ���Դ
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				sf.close();
				System.out.println("�ر���Դ");
			}
		}));
	}
	
	/**
	 * ��Sesion
	 * @return
	 */
	public static Session openSession(){
		Session session=sf.openSession();
		return session;
	}
	/**
	 * ��õ�ǰsession		
	 * @return
	 */
	public static Session getCurrentSession(){
		Session session=sf.getCurrentSession();
		return session;
	}
}
