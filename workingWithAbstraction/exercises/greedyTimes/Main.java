package workingWithAbstraction.exercises.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap = new LinkedHashMap<>();

        long bagCapacity = Long.parseLong(scanner.nextLine());

        long goldAmount = 0;
        long gemAmount = 0;
        long cashAmount = 0;

        String[] safe = scanner.nextLine().split("\\s+");

        for (int i = 0; i < safe.length; i += 2) {

            String item = safe[i];
            long quantity = Long.parseLong(safe[i + 1]);

            String type = "";

            if (item.length() == 3) {
                type = "Cash";
            } else if (item.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (item.toLowerCase().equals("gold")) {
                type = "Gold";
            }

            if (type.equals("")) {
                continue;
            } else if (bagCapacity < bagMap.values().stream().map(Map::values).flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bagMap.containsKey(type)) {
                        if (bagMap.containsKey("Gold")) {
                            if (quantity > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bagMap.get(type).values().stream().mapToLong(e -> e)
                            .sum() + quantity > bagMap.get("Gold")
                            .values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bagMap.containsKey(type)) {
                        if (bagMap.containsKey("Gem")) {
                            if (quantity > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bagMap.get(type).values().stream().mapToLong(e -> e)
                            .sum() + quantity > bagMap.get("Gem")
                            .values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bagMap.containsKey(type)) {
                bagMap.put((type), new LinkedHashMap<>());
            }

            if (!bagMap.get(type).containsKey(item)) {
                bagMap.get(type).put(item, 0L);
            }

            bagMap.get(type).put(item, bagMap.get(type).get(item) + quantity);

            switch (type) {
                case "Gold" -> goldAmount += quantity;
                case "Gem" -> gemAmount += quantity;
                case "Cash" -> cashAmount += quantity;
            }

        }

        for (var entry : bagMap.entrySet()) {

            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s\n", entry.getKey(), sumValues);

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }

    }
}
