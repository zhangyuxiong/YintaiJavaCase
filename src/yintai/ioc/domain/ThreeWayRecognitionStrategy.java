package yintai.ioc.domain;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by zhangyuxiong on 2015/4/8.
 */
public class ThreeWayRecognitionStrategy implements RecognitionStrategy {
    private int firstRecognitionOffset;
    private int secondRecognitionOffset;

    public ThreeWayRecognitionStrategy(int firstRecognitionOffset, int secondRecognitionOffset) {
        this.firstRecognitionOffset = firstRecognitionOffset;
        this.secondRecognitionOffset = secondRecognitionOffset;
    }

    @Override
    public void calculateRevenueRecognitions(Contract contract) {
        double revenue = contract.getRevenue();
        double[] allocation = new double[]{revenue / 3, revenue / 3, revenue - revenue * 2 / 3};
        java.util.Date date=contract.getWhenSigned();
        contract.addRevenueRecognition(new RevenueRecognition(
                allocation[0],contract.getWhenSigned()
        ));
        Calendar cal1=Calendar.getInstance();
        cal1.setTime(date);
        cal1.add(Calendar.DAY_OF_YEAR,this.firstRecognitionOffset);
        contract.addRevenueRecognition(new RevenueRecognition(
                allocation[1],cal1.getTime()
        ));
        Calendar cal2=Calendar.getInstance();
        cal2.setTime(date);
        cal2.add(Calendar.DAY_OF_YEAR,this.secondRecognitionOffset);
        contract.addRevenueRecognition(new RevenueRecognition(
                allocation[2],cal2.getTime()
        ));
        BigDecimal decimal=new BigDecimal(2.1);
    }
}
