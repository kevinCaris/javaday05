package ex_04;
import ex_04.Animal;

public class Canary extends Animal {
    private int eggs = 0;

    public Canary(String name) {
        super(name, 2, Animal.BIRD);
        System.out.println("Yellow and smart? Here I am!");
    }

    public int getEggsCount() { return eggs; }
    public void layEgg() { eggs++; }
}