package yintai.ioc.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-25
 * Time: 上午10:01
 * To change this template use File | Settings | File Templates.
 */
public class GenericApp {
    public static void main(String[] args){

        Formatter formatter = new FormatterImpl();
        Formatter<String> formatter1 = new FormatterImpl<String>();
        Formatter<Integer> formatter2 = new FormatterImpl<Integer>();

        Iterable<String> data1 = new ArrayList<String>();
        Iterable<Integer> data2 = new ArrayList<Integer>();
        ArrayList<Integer> data3 = new ArrayList<Integer>();


        //formatter2.format(data1);
        formatter.format(data3);



        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();
        ProductService productService = context.getBean(ProductService.class);
        productService.showAllProduct();
    }
}
