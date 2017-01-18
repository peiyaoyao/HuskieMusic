package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class RecsongVo {
	private String error_code;
	private List<Recsong> result;
	
	public RecsongVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Recsong> getResult() {
		return result;
	}

	public void setResult(List<Recsong> result) {
		this.result = result;
	}
	
}
