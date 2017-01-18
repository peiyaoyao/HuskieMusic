package com.cnepay.huskie.music.api.vo;

import java.util.List;

import com.cnepay.huskie.music.api.domain.AlbumSug;
import com.cnepay.huskie.music.api.domain.SongSug;

public class SugVO {

	private String error_code;
	private String order;
	private List<AlbumSug> album;
	private List<SongSug> song;
	
	public SugVO() {}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public List<AlbumSug> getAlbum() {
		return album;
	}

	public void setAlbum(List<AlbumSug> album) {
		this.album = album;
	}

	public List<SongSug> getSong() {
		return song;
	}

	public void setSong(List<SongSug> song) {
		this.song = song;
	}
	
}
