package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class ShowListVo {
	private String error_code;
	private List<ShowList> result;
	
	public ShowListVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<ShowList> getResult() {
		return result;
	}

	public void setResult(List<ShowList> result) {
		this.result = result;
	}
	
}
