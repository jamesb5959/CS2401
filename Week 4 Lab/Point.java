/* This file is given to you
 * DO NOT MODIFY IT
 */

public class Point {

    /* Attributes */
    private double x; // x coordinate
    private double y; // y coordinate

    /* Methods */

    public Point() {}

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + Double.toString(x) + ", " + Double.toString(y) + ")";
    }

    public double distance(Point P) {
        return Math.sqrt(Math.pow(P.getX()-x, 2)
                + Math.pow(P.getY()-y, 2));
    }

}
