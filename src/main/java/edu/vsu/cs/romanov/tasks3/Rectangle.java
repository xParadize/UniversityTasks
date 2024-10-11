package edu.vsu.cs.romanov.tasks3;

public class Rectangle {
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean isPointInRectangle(double x, double y) {
        boolean isPointInXLine = x1 <= x && x <= x2;
        boolean isPointInYLine = y1 <= y && y <= y2;
        return isPointInXLine && isPointInYLine;
    }
}
