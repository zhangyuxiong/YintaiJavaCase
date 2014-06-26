package yintai.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-20
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
//        System.out.println("Bean [" + s + "] created : " + o.toString());
        return o;
    }
}
