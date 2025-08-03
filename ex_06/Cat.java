package ex_06;
import ex_06.Animal;
public class Cat extends Animal {
    private String color;

    public Cat(String name) {
        super(name, 4, Animal.MAMMAL);
        this.color = "grey";
        System.out.println(name + ": MEEEOOWWWW");
    }

    public Cat(String name, String color) {
        super(name, 4, Animal.MAMMAL);
        this.color = color;
        System.out.println(name + ": MEEEOOWWWW");
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void meow() {
        System.out.println(getName() + " the " + color + " kitty is meowing.");
    }
    
}