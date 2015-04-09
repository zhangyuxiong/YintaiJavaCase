package yintai.ioc.domain;

/**
 * Created by zhangyuxiong on 2015/4/8.
 */
public class CompleteeRecognitionsStrategy implements RecognitionStrategy {
    @Override
    public void calculateRevenueRecognitions(Contract contract) {
        contract.addRevenueRecognition(new RevenueRecognition(
                contract.getRevenue(),
                contract.getWhenSigned()));
    }
}
