package yintai.ioc.first;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 上午10:17
 * To change this template use File | Settings | File Templates.
 */
public class HouseBuilder {
    WallWorker wallWorker;
    WindowsWorker windowsWorker;


    public WallWorker getWallWorker() {

        return wallWorker;
    }

    public void setWallWorker(WallWorker wallWorker) {
        this.wallWorker = wallWorker;
    }

    public WindowsWorker getWindowsWorker() {
        return windowsWorker;
    }

    public void setWindowsWorker(WindowsWorker windowsWorker) {
        this.windowsWorker = windowsWorker;
    }

        public HouseBuilder() {
        //wallWorker = new WallWorker();
        //windowsWorker = new WindowsWorker();
    }

    public HouseBuilder(WallWorker wallWorker, WindowsWorker windowsWorker) {
        this.wallWorker = wallWorker;
        this.windowsWorker = windowsWorker;
    }

    public HouseBuilder(WallWorker wallWorker, WindowsWorker windowsWorker,
                        String message,
                        String name) {
        this.wallWorker = wallWorker;
        this.windowsWorker = windowsWorker;
        System.out.println(message);
        System.out.println(name);
    }


    public House build() {
        House house = new House();
        //wall 1
        wallWorker.doWork(house);
        windowsWorker.doWork(house);

        //wall 2
        wallWorker.doWork(house);
        windowsWorker.doWork(house);
        windowsWorker.doWork(house);

        //wall 3
        wallWorker.doWork(house);
        windowsWorker.doWork(house);
        windowsWorker.doWork(house);

        //wall 4
        wallWorker.doWork(house);

        return house;
    }

}
