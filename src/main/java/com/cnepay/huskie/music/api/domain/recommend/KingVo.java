package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class KingVo {
	
	private String error_code;
	private List<King> result;
	
	public KingVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<King> getResult() {
		return result;
	}

	public void setResult(List<King> result) {
		this.result = result;
	}
	
}
