public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("Nikoloz", "Taturashvili", 19, 80, 195);
        if (person.is21()) {
            System.out.println("This Person is 21!");
        } else {
            System.out.println("This Person is not 21!");
        }

        person.print();
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    double weight;
    double height;

    public Person(String firstName, String lastName, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public boolean is21() {
        return age >= 21;
    }

    public void print() {
        String fullName = firstName + " " + lastName;
        System.out.printf("Name: %s\nAge: %d\nWeight: %.2f\nHeight: %.2f", fullName, age, weight, height);
    }
}