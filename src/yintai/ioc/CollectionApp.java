package yintai.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-19
 * Time: 上午9:19
 * To change this template use File | Settings | File Templates.
 */
public class CollectionApp {
    List<String> names;
    Map<String, Integer> ages;
    Set<String> groups;
    Properties config;
    String AppName;

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CollectionApp app = context.getBean(CollectionApp.class);
        System.out.println(app.toString());
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Map<String, Integer> getAges() {
        return ages;
    }

    public void setAges(Map<String, Integer> ages) {
        this.ages = ages;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "CollectionApp{" +
                "names=" + names +
                ", ages=" + ages +
                ", groups=" + groups +
                ", config=" + config +
                ", AppName='" + AppName + '\'' +
                '}';
    }
}
