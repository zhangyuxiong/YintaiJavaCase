package yintai.testing.tdd;

/**
 * Created by zhangyuxiong on 2014/6/25.
 */
public class ChatBot {

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    private  String serviceUrl="http://chatbot.yintai.com/";

    public IHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(IHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    private IHttpClient httpClient=null;
    /**
     * @param input talk content
     * @return bot reply
     */
    public String Chat(String input) {
        String url = String.format("%s%s", serviceUrl, input);
        String reply = httpClient.responseText(url);
        return reply;
    }


}
