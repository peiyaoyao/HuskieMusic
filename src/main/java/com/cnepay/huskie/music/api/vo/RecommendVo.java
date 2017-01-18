package com.cnepay.huskie.music.api.vo;

import java.io.Serializable;
import java.util.List;
import com.cnepay.huskie.music.api.domain.recommend.Module;
import com.cnepay.huskie.music.api.domain.recommend.Recommend;

public class RecommendVo implements Serializable{
	
	private Recommend result;
	private String error_code;
	private List<Module> module;

	public RecommendVo() {}

	public Recommend getResult() {
		return result;
	}

	public void setResult(Recommend result) {
		this.result = result;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Module> getModule() {
		return module;
	}

	public void setModule(List<Module> module) {
		this.module = module;
	}
	
}
