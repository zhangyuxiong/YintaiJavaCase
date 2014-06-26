package yintai.ioc.first;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 上午10:24
 * To change this template use File | Settings | File Templates.
 */
public class HouseApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //context.registerShutdownHook();
        HouseBuilder builder = context.getBean(HouseBuilder.class);
        House house = builder.build();
        System.out.println(house.toString());


    }
}
