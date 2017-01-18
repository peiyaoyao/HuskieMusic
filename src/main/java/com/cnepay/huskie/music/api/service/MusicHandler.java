package com.cnepay.huskie.music.api.service;

import com.cnepay.huskie.music.api.base.Request;
import com.cnepay.huskie.music.api.base.Response;

public interface MusicHandler {
	/**
	 *获取搜索建议列表
	 * @param request
	 * @return
	 */
	public Response catalogSug(Request request) throws Exception;
	/**
	 *根据关键字搜索,歌曲，专辑，歌手，伴奏搜索列表
	 * @param request
	 * @return
	 */
	public Response merge(Request request) throws Exception;
	/**
	 * 根据歌手获取专辑列表
	 * @param request
	 * @return
	 */
	public Response getAlbumList(Request request) throws Exception;
	/**
	 * 根据专辑ID获取专辑信息
	 * @param request
	 * @return
	 */
	public Response getAlbumInfo(Request request) throws Exception;
	/**
	 * 根据歌手ID获取歌手歌曲列表
	 * @param request
	 * @return
	 */
	public Response getSongList(Request request) throws Exception;
	/**
	 * 获取百度各种榜单
	 * @param request
	 * @return
	 */
	public Response billList(Request request) throws Exception;
	/**
	 * 获取电台列表
	 * @param request
	 * @return
	 */
	public Response getCategoryList(Request request) throws Exception;
	/**
	 * 获取某电台下的歌曲列表
	 * @param request
	 * @return
	 */
	public Response getChannelSong(Request request) throws Exception;
	/**
	 * 获取歌手列表
	 * @param request
	 * @return
	 */
	public Response get72HotArtist(Request request) throws Exception;
	/**
	 * 根据歌手ID获取歌手信息
	 * @param request
	 * @return
	 */
	public Response getArtisInfo(Request request) throws Exception;
	/**
	 * 获取新碟上架列表
	 * @return
	 */
	public Response getRecommendAlbum(Request request) throws Exception;
	/**
	 *获取 新歌速递列表
	 * @param request
	 * @return
	 */
	public Response getNewSongs(Request request) throws Exception;
	/**
	 * 根据歌曲ID获取歌曲信息(包括下载地址)
	 * @param request
	 * @return
	 */
	public Response getSongInfo(Request request) throws Exception;

}
