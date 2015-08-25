package com.chu.clothes.enumBean;

/**
 * 服务器返回状态码及错误信息
 * 
 * @author chu
 *
 */
public enum RetCodeType {
	
	UNDEFINED(0,"初始化"),
	PASS_OK(200,"请求成功"),
	PASS_NODATA(400,"请求成功，没有数据"),
	EX_AUTH(503,"没有权限"),
	EX_PARAM(500,"请求失败");
	/**
	 * 错误码
	 */
	private int code;
	
	/**
	 * 错误信息
	 */
	private String msg;
	
	RetCodeType(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
}
