package yintai.testing.tdd;

/**
 * Created by zhangyuxiong on 2014/6/23.
 */
public class Payment {

    public IAccountMapper getAccountMapper() {
        return accountMapper;
    }

    public void setAccountMapper(IAccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    private IAccountMapper accountMapper =null;


    public void Pay(int paymentAccountId,int incomeAccountId,double amount)
    {
        Account paymentAccount= accountMapper.find(paymentAccountId);
        Account incomeAccount=accountMapper.find(incomeAccountId);
        paymentAccount.setAmount(paymentAccount.getAmount()-amount);
        incomeAccount.setAmount(incomeAccount.getAmount()+amount);
        accountMapper.save(paymentAccount);
        accountMapper.save(incomeAccount);
    }
}
