package com.cnepay.huskie.music.api.vo;

import java.util.List;

import com.cnepay.huskie.music.api.domain.Artist;

public class ArtistVo {

	private List<Artist> artist;
	private String havemore;
	private String nums;
	private String noFirstChar;
	
	public ArtistVo() {}
	
	public List<Artist> getArtist() {
		return artist;
	}
	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}
	public String getHavemore() {
		return havemore;
	}
	public void setHavemore(String havemore) {
		this.havemore = havemore;
	}
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
	}
	public String getNoFirstChar() {
		return noFirstChar;
	}
	public void setNoFirstChar(String noFirstChar) {
		this.noFirstChar = noFirstChar;
	}

}
