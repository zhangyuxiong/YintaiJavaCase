package yintai.ioc.user;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-18
 * Time: 上午10:09
 * To change this template use File | Settings | File Templates.
 */
public class UserGroup {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}