package test.yintai.testing.tdd;

import yintai.testing.tdd.Account;
import yintai.testing.tdd.IAccountMapper;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by zhangyuxiong on 2014/6/23.
 */
public class AccountMapperFake implements IAccountMapper{

    private Dictionary<String,Account> dict=new Hashtable<String, Account>();

    @Override
    public Account find(int id) {
        return dict.get(String.valueOf(id));
    }

    @Override
    public void save(Account account) {
            dict.put(String.valueOf(account.getId()),account);
    }
}
