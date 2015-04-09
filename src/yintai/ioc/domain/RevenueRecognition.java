package yintai.ioc.domain;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhangyuxiong on 2015/4/8.
 */
public class RevenueRecognition {

    public double getAmount() {
        return amount;
    }

    private double amount;
    private Date date;

    public RevenueRecognition(double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public boolean isRecognizableBy(Date asOf) {
        return asOf.after(this.date) || asOf.equals(this.date);
    }
}
