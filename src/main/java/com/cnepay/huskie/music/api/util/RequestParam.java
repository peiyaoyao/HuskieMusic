package com.cnepay.huskie.music.api.util;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

public final class RequestParam{
	public static final String param_from="from";
	public static final String param_version="version";
	public static final String param_method="method";
	public static final String param_format="format";
	public static final String param_query="query";
	public static final String param_page_no="page_no";
	public static final String param_page_size="page_size";
	public static final String param_type="type";
	public static final String param_data_source="data_source";
	public static final String param_use_cluster ="use_cluster";
	public static final String param_order= "order";
	public static final String param_tinguid ="tinguid";
	public static final String param_offset = "offset";
	public static final String param_limits = "limits";
	public static final String param_album_id ="album_id";
	public static final String param_artistid = "artistid";
	public static final String param_size= "size";
	public static final String param_pn = "pn";
	public static final String param_rn = "rn";
	public static final String param_channelname= "channelname";
	public static final String param_songIds = "songIds";
	public static final String param_limit = "limit";
	public static final String param_focu_num = "focu_num";
	public static final String param_cuid = "cuid";
	public static final String param_channel = "channel";
	public static final String param_operator = "operator";
	public static final String param_area="area";
	public static final String param_sex="sex";

	/**
	 * 基本参数组装
	 * @param from API调用来源 如android
	 * @param version API版本号
	 * @param format  API返回格式
	 * @param method API调用方法
	 * @return 返回参数列表
	 */
	private static List<NameValuePair> getBasicParams(String from,String version,String format,String method){
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair(RequestParam.param_from, from));
		params.add(new BasicNameValuePair(RequestParam.param_version, version));
		params.add(new BasicNameValuePair(RequestParam.param_format,format));
		params.add(new BasicNameValuePair(RequestParam.param_method,method));
		params.add(new BasicNameValuePair(RequestParam.param_channel,"xiaomi"));
		params.add(new BasicNameValuePair(RequestParam.param_operator,"1"));
		return params;
	}
	/**
	 * 获取推荐
	 * @return 参数列表
	 */
	public static List<NameValuePair> getIndexParams(){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID,Constans.PLATFORM_ANDROID_VERSION,Constans.FORMAT,Methods.index);
		params.add(new BasicNameValuePair(RequestParam.param_focu_num, "8"));
		params.add(new BasicNameValuePair(RequestParam.param_cuid, "EBA7176F2FF11651F8AA3CA1D3676B6A"));
		return params;
	}
	/**
	 * 获取歌手
	 * @param offset
	 * @param limit
	 * @param order
	 * @param area
	 * @param sex
	 * @return
	 */
	public static List<NameValuePair> getListParams(String offset,String limit,String order,String area,String sex){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID,Constans.PLATFORM_ANDROID_VERSION,Constans.FORMAT,Methods.getList);
		params.add(new BasicNameValuePair(RequestParam.param_offset,offset));
		params.add(new BasicNameValuePair(RequestParam.param_limit,limit));
		params.add(new BasicNameValuePair(RequestParam.param_order,order));
		params.add(new BasicNameValuePair(RequestParam.param_area,area));
		params.add(new BasicNameValuePair(RequestParam.param_sex,sex));
		return params;
	}
	/**
	 * 搜索建议参数组装
	 * @param queryKeyWord
	 * @return
	 */
	public static List<NameValuePair> getCatalogSugParams(String queryKeyWord){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.catalogSug);
		params.add(new BasicNameValuePair(RequestParam.param_query, queryKeyWord));
		return params;
	}
	/**
	 * 关键字搜索参数组装
	 * @param queryKeyWord
	 * @return
	 */
	public static List<NameValuePair> getMergeParams(String queryKeyWord,String page_no,String page_size){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.merge);
		params.add(new BasicNameValuePair(RequestParam.param_page_no, page_no));
		params.add(new BasicNameValuePair(RequestParam.param_page_size, page_size));
		params.add(new BasicNameValuePair(RequestParam.param_type, "-1"));
		params.add(new BasicNameValuePair(RequestParam.param_data_source, "0"));
		params.add(new BasicNameValuePair(RequestParam.param_use_cluster, "1"));
		return params;
	}
	/**
	 * 根据歌手获取专辑参数组装
	 * @param tinguid
	 * @param offset
	 * @param limit
	 * @return
	 */
	public static List<NameValuePair> getAlbumListParams(String tinguid,String offset,String limit){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.getAlbumList);
		params.add(new BasicNameValuePair(RequestParam.param_order, "1"));
		params.add(new BasicNameValuePair(RequestParam.param_tinguid, tinguid));
		params.add(new BasicNameValuePair(RequestParam.param_offset, offset));
		params.add(new BasicNameValuePair(RequestParam.param_limits, limit));
		return params;
	}
	/**
	 * 根据专辑ID获取专辑详情参数组装
	 * @param albumid
	 * @return
	 */
	public static List<NameValuePair> getAlbumInfoParams(String albumid){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.getAlbumInfo);
		params.add(new BasicNameValuePair(RequestParam.param_album_id, albumid));
		return params;
	}
	/**
	 * 获取歌手歌曲列表
	 * @param tinguid
	 * @param offset
	 * @param limit
	 * @param artistid
	 * @return
	 */
	public static List<NameValuePair> getSongListParams(String tinguid,String offset,String limit,String artistid){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.getSongList);
		params.add(new BasicNameValuePair(RequestParam.param_order,"2"));
		params.add(new BasicNameValuePair(RequestParam.param_tinguid, tinguid));
		params.add(new BasicNameValuePair(RequestParam.param_offset, offset));
		params.add(new BasicNameValuePair(RequestParam.param_limits, limit));
		params.add(new BasicNameValuePair(RequestParam.param_artistid, artistid));
		return params;
	}
	/**
	 * 获取电台列表参数组装
	 * @return
	 */
	public static List<NameValuePair> getCategoryListParams(){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.getCategoryList);
		return params;
	}
	/**
	 * 获取电台下音乐参数组装
	 * @param page_no
	 * @param rn
	 * @param channelname
	 * @return
	 */
	public static List<NameValuePair> getChannelSongParams(String page_no,String rn,String channelname){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_ANDROID, Constans.PLATFORM_ANDROID_VERSION, Constans.FORMAT, Methods.getChannelSong);
		params.add(new BasicNameValuePair(RequestParam.param_pn, page_no));
		params.add(new BasicNameValuePair(RequestParam.param_rn, rn));
		params.add(new BasicNameValuePair(RequestParam.param_channelname, channelname));
		return params;
	}
	/**
	 * 获取歌手列表参数组装
	 * @param offset
	 * @param limit
	 * @return
	 */
	public static List<NameValuePair> get72HotArtistParams(String offset,String limit){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_PC, Constans.PLATFORM_PC_VERSION, Constans.FORMAT, Methods.get72HotArtist);
		params.add(new BasicNameValuePair(RequestParam.param_offset,offset));
		params.add(new BasicNameValuePair(RequestParam.param_limit, limit));
		return params;
	}
	/**
	 * 根据歌手ID获取歌手信息参数组装
	 * @param tinguid
	 * @return
	 */
	public static List<NameValuePair> getinfoParams(String tinguid){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_PC, Constans.PLATFORM_PC_VERSION, Constans.FORMAT, Methods.getinfo);
		params.add(new BasicNameValuePair(RequestParam.param_tinguid,tinguid));
		return params;
	}
	/**
	 * 新碟上架参数组装
	 * @param offset
	 * @param limit
	 * @return
	 */
	public static List<NameValuePair> getRecommendAlbumParams(String offset,String limit){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_PC, Constans.PLATFORM_PC_VERSION, Constans.FORMAT, Methods.getRecommendAlbum);
		params.add(new BasicNameValuePair(RequestParam.param_offset,offset));
		params.add(new BasicNameValuePair(RequestParam.param_limit,limit));
		return params;
	}
	/**
	 * 新歌速递参数组装
	 * @param offset
	 * @param limit
	 * @return
	 */
	public static List<NameValuePair> getNewSongsParams(String offset,String limit){
		List<NameValuePair> params = getBasicParams(Constans.PLATFORM_PC, Constans.PLATFORM_PC_VERSION, Constans.FORMAT, Methods.getNewSongs);
		params.add(new BasicNameValuePair(RequestParam.param_offset,offset));
		params.add(new BasicNameValuePair(RequestParam.param_limit,limit));
		return params;
	}
	/**
	 * 获取歌曲详细信息参数组装
	 * @param songid
	 * @return
	 */
	public static List<NameValuePair> getSongInfoParams(String songid){
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair(RequestParam.param_songIds, songid));
		return params;
	}
	/**
	 * 获取基础性的URI组装
	 * @return
	 */
	public static URIBuilder getBasicURI(){
		URIBuilder uriBuilder = new URIBuilder()
				.setScheme(URLConstans.Baidu_Scheme)
				.setHost(URLConstans.Baidu_Host)
				.setPath(URLConstans.Baidu_Path);
		return uriBuilder;
	}
	/**
	 * 获取歌曲的URI组装
	 * @return
	 */
	public static URIBuilder getSongURI(){
		URIBuilder uriBuilder = new URIBuilder()
				.setScheme(URLConstans.Baidu_Scheme)
				.setHost(URLConstans.Baidu_Song_Host)
				.setPath(URLConstans.Baidu_Song_Path);
		return uriBuilder;
	}
}
