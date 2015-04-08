package test.yintai.testing.tdd;

import org.junit.Test;
import yintai.testing.tdd.ChatBot;
import yintai.testing.tdd.IHttpClient;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;
/**
 * Created by zhangyuxiong on 2014/6/26.
 */
public class ChatBotEasyMockTest {

    @Test
    public void testChat() throws Exception {

        IHttpClient client = createMock(IHttpClient.class);
        expect(client.responseText(contains("test"))).andReturn("Test");
        replay(client);
        ChatBot bot = new ChatBot();
        bot.setHttpClient(client);
        String actual = bot.Chat("test");
        assertEquals("Test", actual);
        verify(client);
    }
}
