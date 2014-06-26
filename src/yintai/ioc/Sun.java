package yintai.ioc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-18
 * Time: 上午10:13
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    String name;
    String created;

    public static Sun current() {
        Sun s = new Sun();
        s.name = "太阳";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //如果scope是prototype,此处还是执行
        s.created = dateFormat.format(date);
        return s;
    }
}