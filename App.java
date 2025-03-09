package haileyArnold.myZoo.com;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Print a welcome message to the user
        System.out.println("Welcome to my Zoo Program! \n\n");

        // Create an empty list to store Animal objects
        ArrayList<Animal> animals = new ArrayList<>();
        Map<String, Integer> speciesCount = new HashMap<>();

        // Read animal data from file
        String inputPath = "C:/cpptxtfiles/arrivingAnimals.txt";
        String outputPath = "C:/cpptxtfiles/newAnimals.txt";
        
        try (Scanner scanner = new Scanner(new File(inputPath))) {
            while (scanner.hasNextLine()) {
                String line1 = scanner.nextLine().trim();
                if (!scanner.hasNextLine()) break;
                String line2 = scanner.nextLine().trim(); // Skip the second line
                
                try {
                    processAnimalEntry(line1, animals, speciesCount);
                } catch (Exception e) {
                    System.out.println("Error processing animal entry: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find file " + inputPath);
            e.printStackTrace();
            return;
        }

        // Write output to file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("Number of animals is: " + Animal.numOfAnimals + "\n");

            // Write species counts
            writer.println("Species Counts:");
            for (Map.Entry<String, Integer> entry : speciesCount.entrySet()) {
                writer.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
            writer.println();

            // Write animal details
            for (Animal animal : animals) {
                writer.println(animal); // Memory address
                writer.printf("Animal name: name needed, Age: %d, Species: %s%n", 
                            animal.getAge(), animal.getSpecies());
            }

            writer.println("\nNumber of animals is: " + Animal.numOfAnimals);
            
            System.out.println("Output written to " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processAnimalEntry(String line1, ArrayList<Animal> animals, Map<String, Integer> speciesCount) {
        try {
            // Parse first line which contains age and species
            String[] parts = line1.split(",");
            
            // Parse age and species from first part
            String[] firstPart = parts[0].trim().split(" ");
            int age = Integer.parseInt(firstPart[0]);
            String species = firstPart[firstPart.length - 1];

            // Update species count
            speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);

            // Create animal and add to list (with placeholder values for other fields)
            Animal animal = createAnimal(species, "name needed", age, "", "unknown", "unknown", 0.0, "unknown");
            if (animal != null) {
                animals.add(animal);
            }
        } catch (Exception e) {
            System.out.println("Error processing entry: " + e.getMessage());
        }
    }

    private static Animal createAnimal(String species, String name, int age, String gender, 
                                     String birthSeason, String color, double weight, String origin) {
        switch (species.toLowerCase()) {
            case "hyena":
                return new Hyena(name, age, gender, birthSeason, color, weight, origin);
            case "lion":
                return new Lion(name, age, gender, birthSeason, color, weight, origin);
            case "tiger":
                return new Tiger(name, age, gender, birthSeason, color, weight, origin);
            case "bear":
                return new Bear(name, age, gender, birthSeason, color, weight, origin);
            default:
                System.out.println("Unknown species: " + species);
                return null;
        }
    }
}
