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
 * 本类用于单元测试
 * @author SZW
 * @date 2018年5月23日
 * @version 1.0 
 */
public class JUnit {

	//登录数据库读取测试
	@Test
	public void loginTest(){
		new LoginAction().login();
	}
	//修改个人信息测试
	@Test
	public void changeUserInfoTest(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		String sdate="2016-06-08";
		Date date;
		try {
			date=sdf.parse(sdate);
			new ChangeUserInfoService().updataUserInfo("4", "测试", "002", "003", "004", date, "005", "006","111");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Date date=new Date();
	}
	//获取新闻列表测试
	@Test
	public void getNewsList(){
		List<NewsEntity> newsList=new MainPageLoadService().getNewsList();
		System.out.println(newsList);
	}
	//获取公告列表测试
	@Test
	public void getInformList(){
		List<InformEntity> informList=new MainPageLoadService().getInformList();
		System.out.println(informList);
	}
	//获取竞赛题测试
	@Test
	public void getQuestionList(){
		List<QuestionBankEntity> list=new AnswerListService().getQuestionList();
		System.out.println(list);
	}
	//测试录入比赛结果
	@Test
	public void setResult(){
		new SubmitAnswerResultService("1", new String[10], new String[10], "20", "100").save();
	}
}
