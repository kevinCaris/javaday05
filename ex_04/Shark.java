package ex_04;
import ex_04.Animal;
public class Shark extends Animal {
    private boolean frenzy = false;

    public Shark(String name) {
        super(name, 0, Animal.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean value) {
        frenzy = value;
    }

    public void status() {
        if (frenzy)
            System.out.println(getName() + " is smelling blood and wants to kill.");
        else
            System.out.println(getName() + " is swimming peacefully.");
    }

    public static void main(String[] args) {
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");
        willy.status();
        willy.smellBlood(true);
        willy.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());
    }
}
