package yintai.ioc.first;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 上午10:18
 * To change this template use File | Settings | File Templates.
 */
public class WindowsWorker {
    public void doWork(House house){
        house.setWindowsCount(house.getWindowsCount() + 1);
        System.out.println("do windowswork.");
    }
}
