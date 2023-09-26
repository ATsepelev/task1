package p1;

import java.util.List;

public class Dog extends Animal{
    private final List<String> canEat = List.of("мясо","корм для собак");

    private final boolean livesInHouse;
    public Dog(Integer age, String name, boolean livesInHouse) {
        super(age, name);
        this.livesInHouse = livesInHouse;
    }

    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Собака кушает: " + food);
        } else {
            System.out.println("Собака не хочет кушать " + food);
        }
    }
}
