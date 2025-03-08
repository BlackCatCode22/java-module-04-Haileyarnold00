package haileyArnold.myZoo.com;

public class Animal {
    private String animalName;
    private String species;
    private int age;

    public static int numOfAnimals = 0;

    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new Animal object was created. \n");

        animalName = name;
        species = aSpecies;
        age = anAge;
        numOfAnimals++;

        }

        public Animal() {
            System.out.println("\n A new Animal object was created.\n");
            numOfAnimals++;
        }

        public String getName(){
            return animalName;
        }
        public void setName(String name) {
            this.animalName = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge (int age) {
            this.age = age;
        }
        public String getSpecies() {
            return species;
        }
        public void setSpecies(String species) {
            this.species = species;
        }

    }

