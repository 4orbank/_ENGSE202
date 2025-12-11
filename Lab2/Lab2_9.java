package Lab2;

import java.util.Scanner;

public class Lab2_9 {

    static class Address {
        String street;
        String city;
        String zipCode;

        Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        public String getFullAddress() {
            return street + ", " + city + ", " + zipCode;
        }
    }

    static class Student {
        String name;
        Address address;

        Student(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public void displayProfile() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address.getFullAddress());
        }
    }

    public static void main(String[] args) {

        Scanner getaddress = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String name = getaddress.nextLine();
        System.out.print("Enter a street (name or number) : ");
        String street = getaddress.nextLine();
        System.out.print("Enter a city : ");
        String city = getaddress.nextLine();
        System.out.print("Enter a zipcode : ");
        String zip = getaddress.nextLine();

        Address addr = new Address(street, city, zip);

        Student stu = new Student(name, addr);

        stu.displayProfile();

        getaddress.close();
    }
}
