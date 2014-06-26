package yintai.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());

        System.out.println("code:" + helloService.hashCode());
        HelloService helloService2 = context.getBean(HelloService.class);
        System.out.println("code2:" + helloService2.hashCode());

        //static method instance
        Sun s = context.getBean(Sun.class);
        print(s.name + " , " + s.created);
        Thread.sleep(1000);
        Sun s2 = context.getBean(Sun.class);
        print(s2.name + " , " + s2.created);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
