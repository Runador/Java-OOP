package workingWithAbstraction.exercises.trafficlights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLights[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> TrafficLights.valueOf(light))
                .toArray(TrafficLights[]::new);

        int numberOfChanges = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfChanges; i++) {
            updateLights(lights);
            printLights(lights);
        }

    }



    private static void updateLights(TrafficLights[] lights) {
        // TrafficLights light - тази променлива тук е копие
        // for циклом можем изменить значение, так как foreach не меняет
        /* for (TrafficLights light : lights) {
             switch (light) {
                case RED -> light = TrafficLights.YELLOW;
                case YELLOW -> light = TrafficLights.GREEN;
                case GREEN -> light = TrafficLights.RED;
            }
        } */
        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED -> lights[i] = TrafficLights.GREEN;
                case YELLOW -> lights[i] = TrafficLights.RED;
                case GREEN -> lights[i] = TrafficLights.YELLOW;
            }
        }
    }

    private static void printLights(TrafficLights[] lights) {
        for (TrafficLights light : lights) {
            System.out.print(light + " ");
        }
        System.out.println();
    }

}
