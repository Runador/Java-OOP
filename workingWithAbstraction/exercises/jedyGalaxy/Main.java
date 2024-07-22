package workingWithAbstraction.exercises.jedyGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        long sum = 0;
        int value = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] jedyTokens = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
            int[] evilTokens = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int evilRow = evilTokens[0];
            int evilCol = evilTokens[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < matrix.length && evilCol < matrix[0].length) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int jedyRow = jedyTokens[0];
            int jedyCol = jedyTokens[1];

            while (jedyRow >= 0 && jedyCol < matrix[1].length) {
                if (jedyRow < matrix.length && jedyCol >= 0 && jedyCol < matrix[0].length) {
                    sum += matrix[jedyRow][jedyCol];
                }
                jedyCol++;
                jedyRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }
}
