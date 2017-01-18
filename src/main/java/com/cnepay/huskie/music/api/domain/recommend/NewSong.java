package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class NewSong {
	
	private String pic_500;
	private String listid;
	private List<SongInfo> song_info;
	
	public NewSong() {}

	public String getPic_500() {
		return pic_500;
	}

	public void setPic_500(String pic_500) {
		this.pic_500 = pic_500;
	}

	public String getListid() {
		return listid;
	}

	public void setListid(String listid) {
		this.listid = listid;
	}

	public List<SongInfo> getSong_info() {
		return song_info;
	}

	public void setSong_info(List<SongInfo> song_info) {
		this.song_info = song_info;
	}
	
}
