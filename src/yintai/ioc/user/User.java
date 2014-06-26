package yintai.ioc.user;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-17
 * Time: 下午10:56
 * To change this template use File | Settings | File Templates.
 */
//public class User implements InitializingBean, DisposableBean {
public class User implements DisposableBean {
    private int id;
    private String name;
    private UserGroup userGroup;

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    /*Demo: No default constructor found exception */
    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userGroup=" + userGroup +
                '}';
    }

//    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("call afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("call destroy");
    }
}
