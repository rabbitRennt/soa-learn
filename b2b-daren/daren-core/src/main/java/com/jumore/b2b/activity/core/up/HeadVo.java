package com.jumore.b2b.activity.core.up;

/**
 * 头部信息
 * 
 * @author
 */
public class HeadVo {
	private boolean validate;// 验证
	private String sign;// 签名
	private String api;// api名称
	private String av;// api版本号
	private String v;// 协议版本
	private String sId;

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getAv() {
		return av;
	}

	public void setAv(String av) {
		this.av = av;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

}
