package ex_06;
import ex_06.Animal;
public class GreatWhite extends Shark {
    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        if (animal instanceof Canary) {
            System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
        } else if (animal instanceof Shark) {
            System.out.println(getName() + ": The best meal one could wish for.");
        } else {
            super.eat(animal);
        }
    }
    public static void main(String[] args) {
        GreatWhite jaws = new GreatWhite("Jaws");
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");
        jaws.status();
        jaws.smellBlood(true);
        jaws.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());
        jaws.eat(titi);
        jaws.eat(willy);
    }
}