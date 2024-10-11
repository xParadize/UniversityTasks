package edu.vsu.cs.romanov.tasks3;

public class VerticalParabolaGreen {
    public double x0;
    public double y0;
    public double a;


    public VerticalParabolaGreen(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointInVerticalParabolaGreen(double x, double y) {
        return y <= a * Math.pow(x - x0, 2) + y0;
    }
}

