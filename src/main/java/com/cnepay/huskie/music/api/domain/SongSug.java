package com.cnepay.huskie.music.api.domain;

import java.io.Serializable;
/**
 * 百度音乐API歌曲Domain
 * @author peiyaoyao
 * */
public class SongSug implements Serializable{

	private static final long serialVersionUID = -8591255820082946896L;
	private String bitrate_fee;
	private String weight;
	private String songname;
	private String songid;
	private String has_mv;
	private String yyr_artist;
	private String artistname;
	private String resource_provider;
	private String control;
	private String encrypted_songid;
	
	public SongSug() {}

	public String getBitrate_fee() {
		return bitrate_fee;
	}

	public void setBitrate_fee(String bitrate_fee) {
		this.bitrate_fee = bitrate_fee;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSongname() {
		return songname;
	}

	public void setSongname(String songname) {
		this.songname = songname;
	}

	public String getSongid() {
		return songid;
	}

	public void setSongid(String songid) {
		this.songid = songid;
	}

	public String getHas_mv() {
		return has_mv;
	}

	public void setHas_mv(String has_mv) {
		this.has_mv = has_mv;
	}

	public String getYyr_artist() {
		return yyr_artist;
	}

	public void setYyr_artist(String yyr_artist) {
		this.yyr_artist = yyr_artist;
	}

	public String getArtistname() {
		return artistname;
	}

	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}

	public String getResource_provider() {
		return resource_provider;
	}

	public void setResource_provider(String resource_provider) {
		this.resource_provider = resource_provider;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getEncrypted_songid() {
		return encrypted_songid;
	}

	public void setEncrypted_songid(String encrypted_songid) {
		this.encrypted_songid = encrypted_songid;
	}
	
	@Override
	public String toString() {
		return "["+songid+","+songname+","+artistname+","+yyr_artist+","+control+","+","+bitrate_fee+","+encrypted_songid+","+has_mv+","+resource_provider+","+weight+"]\n";
	}
}
