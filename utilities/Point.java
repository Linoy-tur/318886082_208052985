package utilities;

/**
 * @author Linoy Turgeman 318886082
 * @author Kesem vaknin 208052985 */

public class Point {

    public static final int MAX_X = 1000000;
    public static final int MIN_X = 0;
    public static final int MAX_Y = 800;
    public static final int MIN_Y = 0;

    private double x;
    private double y;
    /**
     *default Constructor of the class, the constructor initialize the Point 0 0
     */
    public Point() {
        this(0, 0);
    }
    /**
     *Constructor of the class, the constructor initialize point x and point y of the Point.
     * @param x (required).
     * @param y (required).
     */
    public Point(double x, double y) {
        if (!(this.setX(x))) {
            this.x = 0;
        }
        if (!(this.setY(y))) {
            this.y = 0;
        }
    }
    /**
     *Constructor of the class, the constructor initialize point other of the Point.
     * @param other (required).
     *
     */
    public Point(Point other) {
        if (other == null) {
            other = new Point(0, 0);
        }
        this.setX(other.x);
        this.setY(other.y);
    }
    /** Returns the x .  */

    public double getX() {
        return x;
    }
    /** Returns the y .  */

    public double getY() {
        return y;
    }

    public boolean setX(double x) {
        if (x > MAX_X || x < MIN_X) {
            return false;
        }
        this.x = x;
        return true;
    }

    public boolean setY(double y) {
        if (y > MAX_Y || y < MIN_Y) {
            return false;
        }
        this.y = y;
        return true;
    }
    /** Returns the x and y .  */

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

}