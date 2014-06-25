package test.yintai.testing.tdd;
import static org.mockito.Mockito.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import yintai.testing.tdd.Chatbot;
import yintai.testing.tdd.IHttpClient;

import static org.junit.Assert.assertEquals;


/**
 * Chatbot Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 25, 2014</pre>
 */
public class ChatbotTest {

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }

    /**
     * Method: Chat(String input)
     */
    @Test
    public void testChat() throws Exception {

        IHttpClient client = new HttpClientStub();
        Chatbot bot = new Chatbot();
        bot.setHttpClient(client);
        String actual = bot.Chat("test");
        assertEquals("Test", actual);

    }

    @Test
    public void testChat2() throws Exception {
        IHttpClient client = mock(IHttpClient.class);
        Chatbot bot = new Chatbot();
        bot.setHttpClient(client);


        when(client.responseText(anyString())).thenReturn("I don't understand what you say.");
        when(client.responseText(contains("hello"))).thenReturn("hello");
        when(client.responseText(contains("hi"))).thenReturn("hi");


        String actual = bot.Chat("hi");
        assertEquals("hi", actual);

        actual = bot.Chat("hello");
        assertEquals("hello", actual);


        actual = bot.Chat("1");
        assertEquals("I don't understand what you say.", actual);
    }


}
