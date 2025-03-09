package haileyArnold.myZoo.com;

public class Hyena extends Animal {
    private String habitat;  // Hyenas are from Friguia Park, Tunisia

    public Hyena(String name, int age, String gender, String birthSeason, 
                String color, double weight, String origin) {
        super(name, "Hyena", age, gender, birthSeason, color, weight, origin);
        this.habitat = "Hyena Habitat";
    }

    // Default constructor
    public Hyena() {
        super();
        setSpecies("Hyena");
        setOrigin("Friguia Park, Tunisia");  // Default origin for hyenas
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
