package test.yintai.testing.tdd;

import yintai.testing.tdd.IHttpClient;

/**
 * Created by zhangyuxiong on 2014/6/25.
 */
public class HttpClientStub implements IHttpClient {
    @Override
    public String responseText(String url) {
        return "Test";
    }
}

