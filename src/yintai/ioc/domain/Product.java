package yintai.ioc.domain;

/**
 * Created by zhangyuxiong on 2015/4/8.
 */
public class Product {
    private String name;
    private RecognitionStrategy recognitionStrategy;

    public Product(String name,RecognitionStrategy recognitionStrategy)
    {
        this.name=name;
        this.recognitionStrategy = recognitionStrategy;
    }

    public void calculateRevenueRecognitions(Contract contract)
    {
        this.recognitionStrategy.calculateRevenueRecognitions(contract);
    }


    public static Product newWordProcessor(String name)
    {
        return  new Product(name,new CompleteeRecognitionsStrategy());
    }

    public  static Product newSpreadsheet(String name)
    {
        return  new Product(name,new ThreeWayRecognitionStrategy(60,90));
    }
}

