package p1;

import java.util.List;

public class Hare extends Animal{
    private final List<String> canEat = List.of("яблоко","капуста");
    private Integer jumpHeight;

    public Hare(Integer age, String name, Integer jumpHeight) {
        super(age, name);
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Заяц кушает: " + food);
        } else {
            System.out.println("Заяц не хочет кушать " + food);
        }
    }
}
