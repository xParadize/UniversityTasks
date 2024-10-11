package edu.vsu.cs.romanov.tasks3;

public class Circle {
    public double x0;
    public double y0;
    public double r;

    public Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public boolean isPointInCircle(double x, double y) {
        return Math.pow((x - 2), 2) + Math.pow((y - 5), 2) <= r * r;
    }
}
