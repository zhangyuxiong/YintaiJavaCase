package yintai.ioc.generic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-25
 * Time: 上午10:09
 * To change this template use File | Settings | File Templates.
 */
public class FormatterImpl<T> implements Formatter<T>, BeanNameAware, ApplicationContextAware {

    private Class type;
    private Iterable<T> localData;

    public FormatterImpl() {
    }

    public FormatterImpl(Iterable<T> localData) {
        this.localData = localData;
//        type = T.class;
    }


    @Override
    public String format(Iterable<T> data) {

//        if (data == null ) {
//            System.out.println("OOO");
//            return "[NULL]";
//        }


        StringBuilder sb = new StringBuilder();
        for (Iterator<T> i = data.iterator(); i.hasNext(); ) {
            sb.append("[" + i.next() + "]  ");
        }
        return sb.toString();
    }

    @Override
    public String format() {

        return format(localData);
    }

    @Override
    public void setBeanName(String name) {
//        System.out.println("BeanNameAware.setBeanName  : " +name);
//        name = "customname:"+name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext.containsBean(\"abc\") : " +
                applicationContext.containsBean("abc")
        );
    }
}
