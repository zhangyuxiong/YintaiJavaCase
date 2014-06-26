package yintai.ioc.user;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-17
 * Time: 下午11:25
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User find(int id) {
        return new User(110, "Tom");
    }
}
