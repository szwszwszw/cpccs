package com.wechat_small_program.action;

import java.util.List;

import com.wechat_small_program.entity.QuestionBankEntity;
import com.wechat_small_program.service.AnswerListService;

/**
 * ��Ӧ΢��С����������ҳ���б����������
 * @author SZW
 * @date 2018��5��22��
 * @version 1.0 
 */
public class AnswerListAction {
	//��Ӧ����
	private boolean isOK;
	private String msg;
	private List<QuestionBankEntity> answerList;
	
	/**
	 * ִ��ҵ�����
	 * @return ���ؽ������Ϊresult�ڵ��ִ������
	 */
	public String getList(){
		this.answerList=new AnswerListService().getQuestionList();
		this.isOK=true;
		this.msg="���سɹ�";
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