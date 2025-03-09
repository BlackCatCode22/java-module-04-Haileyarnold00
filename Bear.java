package haileyArnold.myZoo.com;

public class Bear extends Animal {
    private String habitat;  // Bears are from Alaska Zoo or Woodland Park Zoo

    public Bear(String name, int age, String gender, String birthSeason, 
               String color, double weight, String origin) {
        super(name, "Bear", age, gender, birthSeason, color, weight, origin);
        this.habitat = "Bear Habitat";
    }

    // Default constructor
    public Bear() {
        super();
        setSpecies("Bear");
        setOrigin("Alaska Zoo, Alaska");  // Default origin for bears
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString();  // Use parent's toString for consistent format
    }
}
