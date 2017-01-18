package com.cnepay.huskie.music.api.domain;

import java.io.Serializable;

public class BaseApi<T> implements Serializable{

	private static final long serialVersionUID = -8369948663603431172L;

	private T result;
	private String error_code;
	
	public BaseApi() {}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	
}
