public class MyMath2 {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int mySum(int x, int y) {
        return x + y;
    }

    public int myDivide(int x, int y) {
        return x / y;
    }

    public void sleepMethod () throws InterruptedException {
        Thread.sleep(1550);
    }
}
