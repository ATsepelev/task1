package p1;

import java.util.List;

public class Tiger extends Animal{
    private final List<String> canEat = List.of("мясо","заяц");
    private Integer numberOfLanes;
    public Tiger(Integer age, String name, Integer numberOfLanes) {
        super(age, name);
        this.numberOfLanes = numberOfLanes;
    }

    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Тигр кушает: " + food);
        } else {
            System.out.println("Тигр не хочет кушать " + food);
        }
    }
}
