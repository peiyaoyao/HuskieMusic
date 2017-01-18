package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class EntryVo {
	private String error_code;
	private List<Entry> result;
	
	public EntryVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Entry> getResult() {
		return result;
	}

	public void setResult(List<Entry> result) {
		this.result = result;
	}
	
}
