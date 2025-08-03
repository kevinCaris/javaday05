package ex_06;
public class Animal {
    public static final int MAMMAL = 0;
    public static final int FISH = 1;
    public static final int BIRD = 2;

    private static int animalsAlive = 0;
    private static int mammals = 0;
    private static int fishes = 0;
    private static int birds = 0;

    private String name;
    private int legs;
    private int type;

    public Animal(String name, int legs, int type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        animalsAlive++;
        switch (type) {
            case MAMMAL: mammals++; break;
            case FISH: fishes++; break;
            case BIRD: birds++; break;
        }
        System.out.println("My name is " + name + " and I am a " + getType() + "!");
    }

    public String getName() { return name; }
    public int getLegs() { return legs; }

    public String getType() {
        switch (type) {
            case MAMMAL: return "mammal";
            case FISH: return "fish";
            case BIRD: return "bird";
            default: return "unknown";
        }
    }

    public static void getNumberOfAnimalsAlive() {
        String msg = "There " + (animalsAlive == 1 ? "is" : "are") + " currently " + animalsAlive + " animal" + (animalsAlive > 1 ? "s" : "") + " alive in our world.";
        System.out.println(msg);
    }

    public static void getNumberOfMammals() {
        System.out.println("There " + (mammals == 1 ? "is" : "are") + " currently " + mammals + " mammal" + (mammals > 1 ? "s" : "") + " alive in our world.");
    }

    public static void getNumberOfFishes() {
        System.out.println("There " + (fishes == 1 ? "is" : "are") + " currently " + fishes + " fish" + (fishes == 1 ? "" : "es") + " alive in our world.");
    }

    public static void getNumberOfBirds() {
        System.out.println("There " + (birds == 1 ? "is" : "are") + " currently " + birds + " bird" + (birds > 1 ? "s" : "") + " alive in our world.");
    }

}
