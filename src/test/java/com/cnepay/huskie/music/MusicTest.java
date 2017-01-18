package com.cnepay.huskie.music;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.cnepay.huskie.music.api.util.RequestParam;
import com.cnepay.huskie.music.api.vo.ArtistVo;
import com.cnepay.huskie.music.api.vo.RecommendVo;
import com.cnepay.huskie.music.api.vo.SugVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MusicTest {

	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClients.createDefault();
//		testGetArtistList(client);
		testIndex(client);
		
	}
	
	public static void testGetArtistList(HttpClient client) throws Exception{
		URI uri = RequestParam.getBasicURI()
				.addParameters(RequestParam.getListParams("0", "30","1","0","0"))
				.build();
		HttpGet get  = new HttpGet(uri);
		HttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity);
		Gson gson = new Gson();
		ArtistVo artistVo = gson.fromJson(result, ArtistVo.class);
		System.out.println(artistVo.getArtist().size());
		System.out.println(result);
	}
	
	public static void testgetSug(HttpClient client) throws Exception{
		URI uri = RequestParam.getBasicURI()
				.addParameters(RequestParam.getCatalogSugParams("十年"))
				.build();
		HttpGet get  = new HttpGet(uri);
		HttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity);
		Gson gson = new Gson();
		SugVO searchVO = gson.fromJson(result, SugVO.class);
		System.out.println("返回码："+searchVO.getError_code());
		System.out.println("排序："+searchVO.getOrder());
		System.out.println(searchVO.getAlbum().size()+"专辑：\n"+searchVO.getAlbum().toString());
		System.out.println(searchVO.getSong().size()+"歌曲：\n"+searchVO.getSong().toString());
	}
	
	public static void testGetAlbumList(HttpClient client) throws Exception{
		URI songUri = RequestParam.getBasicURI()
				.addParameters(RequestParam.getAlbumListParams("6129", "0","20"))
				.build();
		HttpGet getsong = new HttpGet(songUri);
		String songinfo = EntityUtils.toString(client.execute(getsong).getEntity());
		System.out.println(songinfo);
	}
	
	public static void testIndex(HttpClient client) throws Exception{
		URI uri = RequestParam.getBasicURI()
				.addParameters(RequestParam.getIndexParams())
				.build();
		System.out.println(uri.toString());
		HttpGet get  = new HttpGet(uri);
		HttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity);
		Gson gson = new GsonBuilder().serializeNulls().create();
		
		JsonParser parser = new JsonParser();  
        JsonObject jsonObject = parser.parse(result).getAsJsonObject();  
        JsonObject ob = jsonObject.getAsJsonObject("result");
        ob.remove("new_song");
//        JsonObject ob1 = ob.getAsJsonObject("new_song");
        jsonObject.remove("result");
        jsonObject.add("result", ob);
        System.out.println(jsonObject.toString());
//        NewSong scene = gson.fromJson(ob2, NewSong.class);
//        System.out.println(scene.getSong_info().size()+"222"+scene.getPic_500());
        //将data节点下的内容转为JsonArray  
		RecommendVo searchVO = gson.fromJson(jsonObject.toString(), RecommendVo.class);
		System.out.println("返回码："+searchVO.getError_code());
		System.out.println("排序："+searchVO.getModule().size());
		System.out.println(searchVO.getResult().getMix_9().getResult().size());
	}
}
