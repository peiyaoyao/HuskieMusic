package com.cnepay.huskie.music.api.domain;

import java.io.Serializable;

public class Album implements Serializable{

	private static final long serialVersionUID = -5697995313426746676L;

	private String all_artist_id;
	private String publishtime;
	private String company;
	private String album_desc;
	private String title;
	private String album_id;
	private String pic_small;
	private String hot;
	private String author;
	private String artist_id;
	
	public Album() {}

	public String getAll_artist_id() {
		return all_artist_id;
	}

	public void setAll_artist_id(String all_artist_id) {
		this.all_artist_id = all_artist_id;
	}

	public String getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAlbum_desc() {
		return album_desc;
	}

	public void setAlbum_desc(String album_desc) {
		this.album_desc = album_desc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	public String getPic_small() {
		return pic_small;
	}

	public void setPic_small(String pic_small) {
		this.pic_small = pic_small;
	}

	public String getHot() {
		return hot;
	}

	public void setHot(String hot) {
		this.hot = hot;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}
	
}
