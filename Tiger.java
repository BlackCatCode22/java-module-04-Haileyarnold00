package haileyArnold.myZoo.com;

public class Tiger extends Animal {
    private String habitat;  // Tigers are from Bangladesh or Nepal

    public Tiger(String name, int age, String gender, String birthSeason, 
                String color, double weight, String origin) {
        super(name, "Tiger", age, gender, birthSeason, color, weight, origin);
        this.habitat = "Tiger Habitat";
    }

    // Default constructor
    public Tiger() {
        super();
        setSpecies("Tiger");
        setOrigin("Dhaka, Bangladesh");  // Default origin for tigers
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
