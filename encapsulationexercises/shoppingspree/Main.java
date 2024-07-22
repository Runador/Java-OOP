package encapsulationexercises.shoppingspree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        String input = scanner.nextLine();
        String[] peopleTokens = input.split(";");

        for (String peopleToken : peopleTokens) {
            String name = peopleToken.split("=")[0];
            double money = Double.parseDouble(peopleToken.split("=")[1]);
            Person person = new Person(name, money);
            personList.add(person);
        }

        input = scanner.nextLine();

        String[] productTokens = input.split(";");

        for (String productToken : productTokens) {
            String name = productToken.split("=")[0];
            double cost = Double.parseDouble(productToken.split("=")[1]);
            Product product = new Product(name, cost);
            productList.add(product);
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String productName = tokens[1];

            Person person = personList.stream().filter(p -> p.getName().equals(name)).findFirst().get();
            Product product = productList.stream().filter(p -> p.getName().equals(productName)).findFirst().get();
            person.buyProduct(product);

            input = scanner.nextLine();
        }

    }
}
