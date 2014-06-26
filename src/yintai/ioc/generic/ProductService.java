package yintai.ioc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-25
 * Time: 上午10:02
 * To change this template use File | Settings | File Templates.
 */
public class ProductService {
    private Formatter<String> formatter;
    private Formatter<Integer> inventoryFormatter;

    private List<String> products;
    private List<Integer> inventorys;


    public ProductService(Formatter<String> formatter

    ) {
        this.formatter = formatter;
//        this.inventoryFormatter = inventoryFormatter;
        products = new ArrayList<String>();
        products.add("帽子");
        products.add("鞋子");
        products.add("袜子");


//        inventorys = new ArrayList<Integer>();
//        inventorys.add(2);
//        inventorys.add(1);
//        inventorys.add(40);
    }

    public void showAllProduct() {
//        System.out.println(formatter.format());
        System.out.println(formatter.format(products));
//        System.out.println(inventoryFormatter.format(inventorys));
//        System.out.println(formatter.hashCode() + " - "
//                + " - " + formatter.getClass() + " - " );
    }

    public void dispose(){
        System.out.println("call dispose() ");
    }
}
