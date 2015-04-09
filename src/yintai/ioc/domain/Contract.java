package yintai.ioc.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zhangyuxiong on 2015/4/8.
 */
public class Contract {
    private ArrayList<RevenueRecognition> revenueRecognitionArrayList;
    private Product product;

    public double getRevenue() {
        return revenue;
    }

    private double revenue;

    public Date getWhenSigned() {
        return whenSigned;
    }

    private Date whenSigned;
    private Long id;

    public Contract(Product product,
                    double revenue,
                    Date whenSigned)
    {
        this.product=product;
        this.revenue=revenue;
        this.whenSigned=whenSigned;
        this.revenueRecognitionArrayList=new ArrayList<RevenueRecognition>();

    }

    public void calculateRecognitions(){
        this.product.calculateRevenueRecognitions(this);
    }

    public void addRevenueRecognition(RevenueRecognition revenueRecognition)
    {
        this.revenueRecognitionArrayList.add(revenueRecognition);
    }


    /**
     *
     * @param asOf
     * @return
     */
    public double recognizedRevenue(Date asOf) {
        double result = 0;
        for (int i = 0; i < this.revenueRecognitionArrayList.size(); i++) {
            RevenueRecognition re = this.revenueRecognitionArrayList.get(i);
            if (re.isRecognizableBy(asOf)) {
                result += re.getAmount();
            }
        }
        return result;
    }

}
