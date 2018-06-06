package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.wechat_small_program.action.LoginAction;
import com.wechat_small_program.entity.InformEntity;
import com.wechat_small_program.entity.NewsEntity;
import com.wechat_small_program.entity.QuestionBankEntity;
import com.wechat_small_program.service.AnswerListService;
import com.wechat_small_program.service.ChangeUserInfoService;
import com.wechat_small_program.service.MainPageLoadService;
import com.wechat_small_program.service.SubmitAnswerResultService;

/**
 * �������ڵ�Ԫ����
 * @author SZW
 * @date 2018��5��23��
 * @version 1.0 
 */
public class JUnit {

	//��¼���ݿ��ȡ����
	@Test
	public void loginTest(){
		new LoginAction().login();
	}
	//�޸ĸ�����Ϣ����
	@Test
	public void changeUserInfoTest(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		String sdate="2016-06-08";
		Date date;
		try {
			date=sdf.parse(sdate);
			new ChangeUserInfoService().updataUserInfo("4", "����", "002", "003", "004", date, "005", "006","111");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Date date=new Date();
	}
	//��ȡ�����б����
	@Test
	public void getNewsList(){
		List<NewsEntity> newsList=new MainPageLoadService().getNewsList();
		System.out.println(newsList);
	}
	//��ȡ�����б����
	@Test
	public void getInformList(){
		List<InformEntity> informList=new MainPageLoadService().getInformList();
		System.out.println(informList);
	}
	//��ȡ���������
	@Test
	public void getQuestionList(){
		List<QuestionBankEntity> list=new AnswerListService().getQuestionList();
		System.out.println(list);
	}
	//����¼��������
	@Test
	public void setResult(){
		new SubmitAnswerResultService("1", new String[10], new String[10], "20", "100").save();
	}
}
