package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class Scene {

	private SceneSub result;
	private String error_code;
	private List<Config> config;

	public Scene() {}

	public SceneSub getResult() {
		return result;
	}

	public void setResult(SceneSub result) {
		this.result = result;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public List<Config> getConfig() {
		return config;
	}

	public void setConfig(List<Config> config) {
		this.config = config;
	}

}
