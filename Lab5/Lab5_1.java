package Lab5;

import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String petName = inputReader.nextLine();
        int petAge = Integer.parseInt(inputReader.nextLine());

        Dog myDog = new Dog();

        myDog.name = petName;
        myDog.age = petAge;

        myDog.makeSound();
        myDog.displayInfo();

        inputReader.close();
    }
}
