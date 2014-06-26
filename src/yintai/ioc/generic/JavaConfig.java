package yintai.ioc.generic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-25
 * Time: 上午10:38
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class JavaConfig {
    @Bean(name="productData")
    public Iterable<String> stringIterable(){
        List<String> data = new ArrayList<String>();
        data.add("商品1");
        data.add("商品2");
        data.add("商品3");
        return data;
    }

    @Bean(name="inventoryData")
    public Iterable<Integer> integerIterable(){
        List<Integer> data = new ArrayList<Integer>();
        data.add(11);
        data.add(22);
        data.add(3);
        return data;
    }


}
