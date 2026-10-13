class Student {

    String name;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println();

        Student s2 = new Student("Dharmalingam");

    }
}