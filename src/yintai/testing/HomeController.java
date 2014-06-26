package yintai.testing;

/**
 * Created by on 6/24/2014.
 */
public class HomeController {

    private final HelloService helloService;

    public HomeController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String index() {
        return "<b>" + helloService.say("user") + "</b>";
//        return "<b>Hello:user</b>";
    }
}
