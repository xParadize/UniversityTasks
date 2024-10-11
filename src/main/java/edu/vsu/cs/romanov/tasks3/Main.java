package edu.vsu.cs.romanov.tasks3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Circle C1 = new Circle(2, 5, 5);
    public static final Rectangle R1 = new Rectangle(1, 10, 1, 8);
    public static final HorizontalParabola HP1 = new HorizontalParabola(2, -3, 1.0 / 4.0);
    private static final VerticalParabolaGreen VPG1 = new VerticalParabolaGreen(-1, -5, - 1.0 / 2.0);
    private static final VerticalParabolaYellow VPY1 = new VerticalParabolaYellow(1, -6, - 1.0 / 4.0);

    public static SimpleColor getColor(double x, double y) {

        if (C1.isPointInCircle(x, y)) {
            return SimpleColor.YELLOW;
        }

        if (R1.isPointInRectangle(x, y)) {
            return SimpleColor.BLUE;
        }

        if (HP1.isPointInHorizontalParabola(x, y)) {
            return SimpleColor.ORANGE;
        }

        if (VPG1.isPointInVerticalParabolaGreen(x, y) && VPY1.isPointInVerticalParabolaYellow(x, y)) {
            return SimpleColor.GRAY;
        }

        if (VPG1.isPointInVerticalParabolaGreen(x, y)) {
            return SimpleColor.GREEN;
        }

        if (VPY1.isPointInVerticalParabolaYellow(x, y)) {
            return SimpleColor.YELLOW;
        }

        return SimpleColor.GRAY;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(getColor(x, y));
    }
}
