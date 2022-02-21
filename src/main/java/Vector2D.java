public class Vector2D {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double lenhgt() {
       // return 1;
        return Math.sqrt(x * x + y * y);
    }
}

