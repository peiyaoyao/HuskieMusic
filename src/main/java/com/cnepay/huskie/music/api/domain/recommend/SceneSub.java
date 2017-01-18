package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class SceneSub {
	private List<SceneInfo> action;
	private List<SceneInfo> emotion;
	private List<SceneInfo> operation;
	private List<SceneInfo> other;

	public SceneSub() {}

	public List<SceneInfo> getAction() {
		return action;
	}

	public void setAction(List<SceneInfo> action) {
		this.action = action;
	}

	public List<SceneInfo> getEmotion() {
		return emotion;
	}

	public void setEmotion(List<SceneInfo> emotion) {
		this.emotion = emotion;
	}

	public List<SceneInfo> getOperation() {
		return operation;
	}

	public void setOperation(List<SceneInfo> operation) {
		this.operation = operation;
	}

	public List<SceneInfo> getOther() {
		return other;
	}

	public void setOther(List<SceneInfo> other) {
		this.other = other;
	}

}
