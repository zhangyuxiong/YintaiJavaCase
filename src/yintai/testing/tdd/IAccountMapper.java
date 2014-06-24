package yintai.testing.tdd;

/**
 * Created by zhangyuxiong on 2014/6/23.
 */
public interface IAccountMapper {
    Account find(int id);
    void save(Account account);
}
