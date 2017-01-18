package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class DiyVo {

	private String error_code;
	private List<Diy> result;
	
	public DiyVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Diy> getResult() {
		return result;
	}

	public void setResult(List<Diy> result) {
		this.result = result;
	}
	
}
