package haileyArnold.myZoo.com;

public class Animal {
    public static int numOfAnimals = 0;
    private String name;
    private String species;
    private int age;
    private String gender;
    private String birthSeason;
    private String color;
    private double weight;
    private String origin;

    public Animal(String name, String species, int age, String gender, String birthSeason, String color, double weight, String origin) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.birthSeason = birthSeason;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
        numOfAnimals++;
    }

    // Default constructor
    public Animal() {
        numOfAnimals++;
    }

    // Getters
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getBirthSeason() { return birthSeason; }
    public String getColor() { return color; }
    public double getWeight() { return weight; }
    public String getOrigin() { return origin; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSpecies(String species) { this.species = species; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthSeason(String birthSeason) { this.birthSeason = birthSeason; }
    public void setColor(String color) { this.color = color; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setOrigin(String origin) { this.origin = origin; }

    @Override
    public String toString() {
        return "haileyArnold.myZoo.com.Animal@" + Integer.toHexString(hashCode());
    }
}
