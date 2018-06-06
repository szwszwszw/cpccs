package com.wechat_small_program.action;

import java.util.List;

import com.wechat_small_program.entity.ErrorRecordPo;
import com.wechat_small_program.service.ErrorRecordService;



/**
 * 响应微信小程序的错题记录列表数组的请求
 * @author SZW
 * @date 2018年5月22日
 * @version 1.0 
 */
public class ErrorRecordAction {
	//请求参数
	private String uid;
	//响应参数
	private boolean isOK;
	private String msg;
	private List<ErrorRecordPo> record;
	
	/**
	 * 执行业务操作
	 * @return 返回结果将作为result节点的执行依据
	 */
	public String returnList(){
		this.record=new ErrorRecordService().getErrorRecordList(this.uid);
		this.isOK=true;
		this.msg="加载成功";
		return "success";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	public List<ErrorRecordPo> getRecord() {
		return record;
	}
	public void setRecord(List<ErrorRecordPo> record) {
		this.record = record;
	}
	
}
