package com.cnepay.huskie.music.api.domain.recommend;

import java.util.List;

public class Diy {

	private String position;
	private String tag;
	private List<SongIdList> songidlist;
	private String pic;
	private String title;
	private String collectnum;
	private String type;
	private String listenum;
	private String listid;
	
	public Diy() {}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<SongIdList> getSongidlist() {
		return songidlist;
	}

	public void setSongidlist(List<SongIdList> songidlist) {
		this.songidlist = songidlist;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCollectnum() {
		return collectnum;
	}

	public void setCollectnum(String collectnum) {
		this.collectnum = collectnum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getListenum() {
		return listenum;
	}

	public void setListenum(String listenum) {
		this.listenum = listenum;
	}

	public String getListid() {
		return listid;
	}

	public void setListid(String listid) {
		this.listid = listid;
	}
	
}
