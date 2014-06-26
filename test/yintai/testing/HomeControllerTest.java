package yintai.testing;

import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void testIndex() throws Exception {
        HelloService mock = createMock(HelloService.class);
        expect(mock.say("user")).andReturn("Hello:user");
        replay(mock);

        HomeController homeController = new HomeController(mock);

        assertEquals("<b>Hello:user</b>", homeController.index());
        verify(mock);
    }
}