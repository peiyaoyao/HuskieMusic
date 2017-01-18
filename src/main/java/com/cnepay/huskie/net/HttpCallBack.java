package com.cnepay.huskie.net;

import org.apache.http.HttpResponse;
import org.apache.http.concurrent.FutureCallback;

/**
 * Created by Administrator on 2017/1/17 0017.
 */
public class HttpCallBack implements FutureCallback<HttpResponse>{

    @Override
    public void completed(HttpResponse result) {

    }

    @Override
    public void failed(Exception ex) {

    }

    @Override
    public void cancelled() {

    }
}
