package com.cnepay.huskie.music.api.domain.recommend;

public class SongInfo {

	private String song_id;
	private String title;
	private String pic_premium;
	private String author;
	
	public SongInfo() {}

	public String getSong_id() {
		return song_id;
	}

	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPic_premium() {
		return pic_premium;
	}

	public void setPic_premium(String pic_premium) {
		this.pic_premium = pic_premium;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
