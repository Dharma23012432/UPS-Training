import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Dog dog = new Dog();
                dog.sound();
                break;

            case 2:
                Cat cat = new Cat();
                cat.sound();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}