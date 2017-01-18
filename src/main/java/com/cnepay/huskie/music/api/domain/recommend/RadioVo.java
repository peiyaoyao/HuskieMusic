package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class RadioVo {
	private String error_code;
	private List<Radio> result;
	
	public RadioVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Radio> getResult() {
		return result;
	}

	public void setResult(List<Radio> result) {
		this.result = result;
	}
	
}
