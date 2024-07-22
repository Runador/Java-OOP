package encapsulationexercises.animalfarm;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (name.length() >= 1) {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }
    // The calculateProductPerDay() method is used by the productPerDay() public method.
    // This means the method can safely be hidden inside the Chicken class by declaring it private.
    private double calculateProductPerDay() {
        if (age >= 0 && age <= 5) {
            return 2;
        } else if (age >= 6 && age <= 11) {
            return 1;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return "Chicken %s (age %d) can produce %.2f eggs per day.".formatted(name, age, productPerDay());
    }
}
