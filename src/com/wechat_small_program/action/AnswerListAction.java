package com.wechat_small_program.action;

import java.util.List;

import com.wechat_small_program.entity.QuestionBankEntity;
import com.wechat_small_program.service.AnswerListService;

/**
 * 响应微信小程序竞赛答题页面列表数组的请求
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class AnswerListAction {
	//响应参数
	private boolean isOK;
	private String msg;
	private List<QuestionBankEntity> answerList;
	
	/**
	 * 执行业务操作
	 * @return 返回结果将作为result节点的执行依据
	 */
	public String returnList(){
		this.answerList=new AnswerListService().getQuestionList();
		this.isOK=true;
		this.msg="加载成功";
		return "success";
	}
	public boolean isOK() {
		return isOK;
	}
	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<QuestionBankEntity> getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List<QuestionBankEntity> answerList) {
		this.answerList = answerList;
	}
}
