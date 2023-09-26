package p1;

import java.util.List;

public class Wolf extends Animal{
    private final List<String> canEat = List.of("мясо","заяц");

    public Wolf(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Волк кушает: " + food);
        } else {
            System.out.println("Волк не хочет кушать " + food);
        }
    }
}
