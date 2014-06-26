package yintai.ioc.user;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yintai.ioc.HelloService;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-17
 * Time: 下午11:00
 * To change this template use File | Settings | File Templates.
 */
public class UserApp {

    public static void main(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml", "user.xml");
        exe();
        System.out.println("main end");

    }

    private static void exe() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //context.registerShutdownHook();



        HelloService helloService = context.getBean(HelloService.class);
        print(helloService.sayHello());

        User user = context.getBean(User.class);
        print(user.toString());

        UserService userService = context.getBean(UserService.class);
        User user1 = userService.find(1);
        print(user1.toString());

    }

    private static void print(String message) {
        System.out.println(message);
    }

}
