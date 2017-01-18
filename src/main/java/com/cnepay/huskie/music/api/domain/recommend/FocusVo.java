package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class FocusVo {
	private String error_code;
	private List<Focus> result;
	
	public FocusVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Focus> getResult() {
		return result;
	}

	public void setResult(List<Focus> result) {
		this.result = result;
	}
	
}
