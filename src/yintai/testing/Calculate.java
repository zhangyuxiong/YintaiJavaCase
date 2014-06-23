package yintai.testing;

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

    public int Add(int a,int b)
    {
        int sum=0;
        sum=a+b;
        logger.log(String.format("a:%d b:%d sum:%c",a,b,a+b));
        return sum;
    }


}
