package yintai.ioc.first;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 上午10:19
 * To change this template use File | Settings | File Templates.
 */
public class WallWorker {
    public void doWork(House house){
        house.setWallCount(house.getWallCount() + 1);
        System.out.println("do wallwork.");
    }
}
