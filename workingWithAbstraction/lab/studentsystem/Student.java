package workingWithAbstraction.lab.studentsystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s", name, age, getGradeQuality());
    }

    private String getGradeQuality() {
        String result = "Very nice person.";
        if (grade >= 5.00) {
            result = "Excellent student.";
        } else if (grade >= 3.50) {
            result = "Average student.";
        }
        return result;
    }
}
