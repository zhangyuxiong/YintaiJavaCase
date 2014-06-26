package yintai.ioc.generic;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-25
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public interface Formatter<T> {
    String format(Iterable<T> data);
    String format();


}
