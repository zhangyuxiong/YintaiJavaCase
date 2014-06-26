package yintai.ioc.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class LifecycleApp {
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();
        LiftcycleImpl liftcycle = context.getBean(LiftcycleImpl.class);
        System.out.println(liftcycle.toString());
    }
}
