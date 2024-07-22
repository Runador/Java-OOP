package workingWithAbstraction.lab.pointinrectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 0 0 3 3
        // "{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}"
        String[] coordinates = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Point bottomLeft = new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        Point topRight = new Point(Integer.parseInt(coordinates[2]), Integer.parseInt(coordinates[3]));

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        for (int i = 0; i < n; i++) {
            String[] pointCoordinates = scanner.nextLine().split("\\s+");
            int X = Integer.parseInt(pointCoordinates[0]);
            int Y = Integer.parseInt(pointCoordinates[1]);
            Point point = new Point(X, Y);

            boolean isContains = rectangle.contains(point);

            if (isContains) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}

