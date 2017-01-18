package com.cnepay.huskie.music.api.service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import com.cnepay.huskie.music.api.base.BaiduRequest;
import com.cnepay.huskie.music.api.base.BaiduResponse;
import com.cnepay.huskie.music.api.base.Request;
import com.cnepay.huskie.music.api.base.Response;
import com.cnepay.huskie.music.api.util.RequestParam;

public class BaiduMusicHandler implements MusicHandler {

	@Override
	public Response catalogSug(Request request) throws URISyntaxException {
		BaiduRequest baiduRequest = (BaiduRequest) request;
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		String params = URLEncodedUtils.format(nvps, "UTF-8");
		RequestParam.getCatalogSugParams(request.toString());
		BaiduResponse baiduResponse = new BaiduResponse();
		return baiduResponse;
	}

	@Override
	public Response merge(Request request) {
		return null;
	}

	@Override
	public Response getAlbumList(Request request) {
		return null;
	}

	@Override
	public Response getAlbumInfo(Request request) {
		return null;
	}

	@Override
	public Response getSongList(Request request) {
		return null;
	}

	@Override
	public Response billList(Request request) {
		return null;
	}

	@Override
	public Response getCategoryList(Request request) {
		return null;
	}

	@Override
	public Response getChannelSong(Request request) {
		return null;
	}

	@Override
	public Response get72HotArtist(Request request) {
		return null;
	}

	@Override
	public Response getArtisInfo(Request request) {
		return null;
	}

	@Override
	public Response getRecommendAlbum(Request request) {
		return null;
	}

	@Override
	public Response getNewSongs(Request request) {
		return null;
	}

	@Override
	public Response getSongInfo(Request request) {
		return null;
	}

}
