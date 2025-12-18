//Create a Car class with:
//- fields: brand, model, year
//- a constructor
//- a method displayInfo()

import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Instance method
    void displayInfo() {
        System.out.println("Brand name: " + brand);
        System.out.println("Model name: " + model);
        System.out.println("Release year: " + year);
    }
}

public class CarBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the model name");
        String model = sc.nextLine();

        System.out.println("Enter the Brand name");
        String brand = sc.nextLine();

        System.out.println("Enter the release year");
        int year = sc.nextInt();

        // Create object using constructor
        Car c = new Car(brand, model, year);

        // Call instance method
        c.displayInfo();
    }
}