package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class Mix5Vo {
	private String error_code;
	private List<Mix5> result;
	
	public Mix5Vo() {}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Mix5> getResult() {
		return result;
	}

	public void setResult(List<Mix5> result) {
		this.result = result;
	}

}
