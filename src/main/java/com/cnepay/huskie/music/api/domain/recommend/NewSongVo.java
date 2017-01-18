package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class NewSongVo {
	private String error_code;
	private List<NewSong> result;
	
	public NewSongVo() {
		// TODO Auto-generated constructor stub
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<NewSong> getResult() {
		return result;
	}

	public void setResult(List<NewSong> result) {
		this.result = result;
	}
	
}
