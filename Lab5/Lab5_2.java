package Lab5;

import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {

        Scanner dataReader = new Scanner(System.in);

        String catName = dataReader.nextLine();
        int catAge = Integer.parseInt(dataReader.nextLine());

        Cat myCat = new Cat();

        myCat.name = catName;
        myCat.age = catAge;

        myCat.displayInfo();
        myCat.makeSound();

        dataReader.close();
    }
}
