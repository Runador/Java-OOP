package LabEncapsulation.FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Team team = new Team("Black Pirates");

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            team.addPlayer(new Person(tokens[0], tokens[1],
                    Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3])));
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reverse team have " + team.getReserveTeam().size() + " players");
    }
}
