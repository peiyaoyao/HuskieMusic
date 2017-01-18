package com.cnepay.huskie.music.api.util;

public final class Constans {

	//百度音乐API--[搜索建议]
	public static final String SongsugUrl="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=android&version=5.6.5.0&method=baidu.ting.search.catalogSug&format=json&query=七里香";
	//百度音乐API--[关键字搜索,歌曲，专辑，歌手，伴奏]
	public static final String SearchSongsUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=android&version=5.6.5.0&"
			+ "method=baidu.ting.search.merge&format=json&query=七里香&page_no=1&page_size=50&type=-1&data_source=0&use_cluster=1";
	//百度音乐API--[根据歌手获取专辑列表]
	public static final String AlbumListUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=android&version=5.6.5.0&"
			+ "method=baidu.ting.artist.getAlbumList&format=json&order=1&tinguid=7994&offset=0&limits=30";
	//百度音乐API--[根据专辑ID获取专辑详情]
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=qianqian&version=2.1.0&method=baidu.ting.album.getAlbumInfo&format=json&album_id=122314357
	public static final String AlbumDetailUrl="http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.6.5.0&"
			+ "method=baidu.ting.album.getAlbumInfo&format=json&album_id=67909";
	//百度音乐API--[获取歌手歌曲列表,tinguid为歌手ID]
		public static final String SongListUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
				+ "?from=android&version=5.6.5.0&"
				+ "method=baidu.ting.artist.getSongList&format=json&order=2&tinguid=7994&artistid=7994&offset=0&limits=50";
	//百度音乐API--[新歌榜(type=1)，热歌榜(type=2)，Billboard(type=8)，Hito中文榜(type=18)，KTV热歌榜(type=6)，]
	public static final String NewSongUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.billboard.billList&format=json&type=1&offset=0&size=50";
	//百度音乐API--[电台列表]
	public static final String ChannelUrl =" http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.radio.getCategoryList&format=json";
	//百度音乐API--[电台下歌曲列表]
	public static final String SongChannelUrl =" http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.radio.getChannelSong&format=json&pn=0&rn=10&channelname=public_tuijian_ktv";
	//百度音乐API--[根据歌曲ID获取歌曲信息]
	public static final String SongDerailUrl ="http://music.baidu.com/data/music/links?songIds=270910";
	//百度音乐API--[获取歌手列表]
	public static final String ArtistInfoUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.artist.get72HotArtist&format=json&offset=0&limit=50";
	//百度音乐API--[根据歌手ID查询歌手简介]
	public static final String ArtistDetailUrl = "http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.artist.getinfo&format=json&tinguid=7994";
	//百度音乐API--[新碟上架]
	public static final String NewSongsUrl = "http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.plaza.getRecommendAlbum&format=json&offset=0&limit=50";
	//百度音乐API--[新歌速递]
	public static final String QuickSongUrl ="http://tingapi.ting.baidu.com/v1/restserver/ting"
			+ "?from=qianqian&version=2.1.0&"
			+ "method=baidu.ting.plaza.getNewSongs&format=json&limit=50";
	//安卓版本号
	public static final String PLATFORM_ANDROID_VERSION="5.9.7.1";
	//平台标识-Android
	public static final String PLATFORM_ANDROID ="android";
	//PC版本号
	public static final String PLATFORM_PC="qianqian";
	//PC版本名称
	public static final String PLATFORM_PC_VERSION="2.1.0";
	//返回格式
	public static final String FORMAT="json";
	
	//#############################################################################
	//推荐
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.plaza.index&cuid=EBA7176F2FF11651F8AA3CA1D3676B6A&focu_num=8
	//歌手				--offset  当前第几个
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.artist.getList&format=json&offset=0&limit=48&order=1&area=0&sex=0
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.artist.getList&format=json&offset=0&limit=48&order=1&area=6&sex=1华语男歌手
	//其他歌手
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.artist.getList&format=json&offset=0&limit=48&order=1&area=5&sex=0
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.artist.getList&format=json&offset=96&limit=48&order=1&area=0&sex=0热门歌手
	
	
	//新歌推荐
	//http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.7.1&channel=1413b&operator=1&method=baidu.ting.song.userRecSongList&format=json&page_no=1&page_size=60
	
}
