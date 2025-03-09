package haileyArnold.myZoo.com;

public class Lion extends Animal {
    private String habitat;  // Lions are from Tanzania (Zanzibar or KopeLion)

    public Lion(String name, int age, String gender, String birthSeason, 
               String color, double weight, String origin) {
        super(name, "Lion", age, gender, birthSeason, color, weight, origin);
        this.habitat = "Lion Habitat";
    }

    // Default constructor
    public Lion() {
        super();
        setSpecies("Lion");
        setOrigin("Zanzibar, Tanzania");  // Default origin for lions
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
