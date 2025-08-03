package ex_01;
public class Animal {
    public static final int MAMMAL = 0;
    public static final int FISH = 1;
    public static final int BIRD = 2;

    private String name;
    private int legs;
    private int type;

    public Animal(String name, int legs, int type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getType() + "!");
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        switch (type) {
            case MAMMAL: return "mammal";
            case FISH: return "fish";
            case BIRD: return "bird";
            default: return "unknown";
        }
    }

    
    public static void main(String[] args) {
        Animal isidore = new Animal("Isidore", 4, Animal.MAMMAL);
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
    }
}
