package p1;

import java.util.List;

public class Elephant extends Animal{
    private final List<String> canEat = List.of("бананы","капусту");

    private final Integer trunkLength;
    public Elephant(Integer age, String name, Integer trunkLength) {
        super(age, name);
        this.trunkLength = trunkLength;
    }

    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Слон кушает: " + food);
        } else {
            System.out.println("Слон не хочет кушать " + food);
        }
    }
}
