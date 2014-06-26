package yintai.ioc.first;

/**
 * Created with IntelliJ IDEA.
 * User: hongzhang
 * Date: 14-6-24
 * Time: 上午10:25
 * To change this template use File | Settings | File Templates.
 */
public class House {
    private int Length;
    private int width;
    private int height;
    private String color;
    private int windowsCount;
    private int wallCount;

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public int getWallCount() {
        return wallCount;
    }

    public void setWallCount(int wallCount) {
        this.wallCount = wallCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "Length=" + Length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", windowsCount=" + windowsCount +
                ", wallCount=" + wallCount +
                '}';
    }
}