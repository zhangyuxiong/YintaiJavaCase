package yintai.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yintai.ioc.user.User;
import yintai.ioc.user.UserService;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-18
 * Time: 上午9:52
 * To change this template use File | Settings | File Templates.
 */
public class BeanName {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //getBean by name/id
        UserService userService1 = (UserService) context.getBean("aliasUserService");
        User user2 = userService1.find(2);
        print(user2.getId() + "," + user2.getName());

        String[] beanNames = context.getBeanDefinitionNames();
        print("BeanName:");
        for (int i = 0; i < beanNames.length; i++) {
            print(" " + beanNames[i]);
        }
    }


    private static void print(String message) {
        System.out.println(message);
    }
}
