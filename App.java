package haileyArnold.myZoo.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Print a welcome message to the user
        System.out.println("Welcome to my Zoo Program\n\nd!");

        // Print the initial number of animals (should be 0 at this point)
        System.out.println("\n Number of animals is " + Animal.numOfAnimals);

        String species;
        int age;

        // Create an empty list to store Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // Specify the file path to read from
        String filePath = "C:/javatxtfiles/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            // Read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into parts using comma as delimiter
                String [] parts = line.split(",");

                // Check if the line has at least one part
                if (parts.length >= 1) {
                    // Extract the age and species from the first part
                    String ageAndSpecies = parts[0];
                    System.out.println("ageAndSpecies: " + ageAndSpecies );

                    // Split the age and species into separate parts using space as delimiter
                    String [] theParts = ageAndSpecies.split(" ");
                    // Print the individual parts for debugging
                    for (int i=0; i<5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    // Extract the age and species from the parts
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    // Create a new Animal object with the extracted age and species
                    Animal myAnimal = new Animal("name needed", species, age);

                    // Add the Animal object to the list
                    animals.add(myAnimal);
                }
                // Print the updated number of animals after each line is processed
                System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
            }
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
        // We now have an arrayList of Animals. Let's output them!
        for (Animal animal : animals){
            System.out.println(animal);
            System.out.println("Animal name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies());
        }
        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);

    }
}
