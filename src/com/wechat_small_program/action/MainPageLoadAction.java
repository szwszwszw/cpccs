package com.wechat_small_program.action;

import java.util.List;

import com.wechat_small_program.entity.InformEntity;
import com.wechat_small_program.entity.NewsEntity;
import com.wechat_small_program.service.MainPageLoadService;

/**
 * 响应微信小程序主页加载时新闻和公告列表的请求
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class MainPageLoadAction {
	//响应参数
	private String msg;
	private boolean isOK;
	private List<NewsEntity> newsList;
	private List<InformEntity> informList;
	
	/**
	 * 执行业务操作
	 * @return 返回结果将作为result节点的执行依据
	 */
	public String mainPageLoad(){
		//System.out.println("主页加载");
		try {
			MainPageLoadService service=new MainPageLoadService();
			this.newsList=service.getNewsList();
			this.informList=service.getInformList();
			this.isOK=true;
			this.msg="加载成功";
		} catch (Exception e) {
			this.isOK=false;
			this.msg="服务器开小差啦";
		}
		return "success";
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isOK() {
		return isOK;
	}
	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}
	public List<NewsEntity> getNewsList() {
		return newsList;
	}
	public void setNewsList(List<NewsEntity> newsList) {
		this.newsList = newsList;
	}
	public List<InformEntity> getInformList() {
		return informList;
	}
	public void setInformList(List<InformEntity> informList) {
		this.informList = informList;
	}
}
