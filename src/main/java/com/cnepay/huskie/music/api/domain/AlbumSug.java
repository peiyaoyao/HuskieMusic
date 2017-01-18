package com.cnepay.huskie.music.api.domain;

import java.io.Serializable;

public class AlbumSug implements Serializable{

	private static final long serialVersionUID = 3605219789244487376L;

	private String albumname;
	private String weight;
	private String artistname;
	private String artistpic;
	private String albumid;
	
	public AlbumSug() {}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getArtistname() {
		return artistname;
	}

	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}

	public String getArtistpic() {
		return artistpic;
	}

	public void setArtistpic(String artistpic) {
		this.artistpic = artistpic;
	}

	public String getAlbumid() {
		return albumid;
	}

	public void setAlbumid(String albumid) {
		this.albumid = albumid;
	}
	
	@Override
	public String toString() {
		return "["+artistname+","+artistpic+","+albumname+","+albumid+","+weight+"]\n";
	}
	
}
