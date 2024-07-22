package workingWithAbstraction.lab.studentsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        String line = scanner.nextLine();

        while (!line.equals("Exit")) {
            String[] input = line.split("\\s+");
            studentSystem.parseCommand(input);
            line = scanner.nextLine();
        }
    }
}
