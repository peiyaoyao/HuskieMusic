package com.cnepay.huskie.net;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.impl.nio.conn.PoolingNHttpClientConnectionManager;
import org.apache.http.impl.nio.reactor.DefaultConnectingIOReactor;
import org.apache.http.nio.reactor.ConnectingIOReactor;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Future;

/**
 *  peiyaoyao
 */
public class HttpAsyncUtils {

    static Logger logger = LoggerFactory.getLogger(HttpAsyncUtils.class);

    private static CloseableHttpAsyncClient httpAsyncClient = null;

    //初始化连接池
    static {
        logger.info("=========http异步连接池初始化开始==========");
        try{
            ConnectingIOReactor ioReactor = new DefaultConnectingIOReactor();
            PoolingNHttpClientConnectionManager pool = new PoolingNHttpClientConnectionManager(ioReactor);
            pool.setMaxTotal(HttpConstans.http_max);//设置最大连接数
            pool.setDefaultMaxPerRoute(HttpConstans.max_per_route);//设置每个Host最多连接数
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(HttpConstans.socket_time_out)
                    .setConnectTimeout(HttpConstans.connect_time_out)
                    .build();
            httpAsyncClient = HttpAsyncClients.custom()
                    .setConnectionManager(pool)
                    .setDefaultRequestConfig(requestConfig)
                    .build();
        }catch (IOReactorException e){
            e.printStackTrace();
            logger.info("连接池初始化异常，异常信息："+e.getMessage());
        }
        httpAsyncClient.start();
        logger.info("==========http异步连接池初始化成功==========");
    }

    /**
     * 异步执行表单POST提交，不执行回调
     * @param uri
     * @param nvps
     * @return
     */
    public static synchronized HttpResponse sendPost(URI uri,List<NameValuePair> nvps){
        try{
            return sendPost(uri,nvps,null).get();
        }catch (Exception e){
            logger.debug("POST请求发送失败，异常信息："+e.getMessage());
            return null;
        }
    }
    /**
     * 异步执行表单POST提交，执行回调函数
     * @param uri
     * @param nvps
     * @param response
     * @return
     */
    public static Future<HttpResponse> sendPost(URI uri,List<NameValuePair> nvps,FutureCallback<HttpResponse> response){
        final HttpPost post = new HttpPost(uri);
        HttpEntity entity = new UrlEncodedFormEntity(nvps, Charset.forName("utf-8"));
        post.setEntity(entity);
        return httpAsyncClient.execute(post,response);
    }

    /**
     * 异步执行GET请求
     * @param uri
     * @return
     * @throws Exception
     */
    public static HttpResponse sendGet(URI uri) throws Exception {
        final HttpGet get = new HttpGet(uri);
        return httpAsyncClient.execute(get,null).get();
    }

}
