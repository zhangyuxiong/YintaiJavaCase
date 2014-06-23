package yintai.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloServiceTest {

    @Test
    public void testSay() throws Exception {
        assertEquals("Hello", (new HelloService().Say()));

    }
}