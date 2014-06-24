package yintai.testing.tdd;

import yintai.testing.ILog;

/**
 * Created by ZhangYuxiong on 14-6-23.
 */
public class Calculate {

    public ILog getLogger() {
        return logger;
    }

    public void setLogger(ILog logger) {
        this.logger = logger;
    }

    private ILog logger=null;

    public double Add(double a,double b)
    {
        double sum=0;
        sum=a+b;
        logger.log(String.format("a:%1$.2f b:%1$.2f sum:%1$.2f",a,b,a+b));
        return sum;
    }


}
