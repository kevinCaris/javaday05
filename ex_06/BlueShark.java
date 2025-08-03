package ex_06;
import ex_06.Animal;

public class BlueShark extends Shark {
    private String color;
    public BlueShark(String name) {
        super(name, 0, Animal.FISH);
        this.color = "blue";
        System.out.println("A KILLER IS BORN!");
    }
    public BlueShark(String name, String color) {
        super(name, 0, Animal.FISH);
        this.color = color;
        System.out.println("A KILLER IS BORN!");
    }
}