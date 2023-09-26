package p1;

import java.util.List;

public class Cat extends Animal{

    private final List<String> canEat = List.of("рыба","корм для кошек");
    public Cat(Integer age, String name) {
        super(age, name);
    }
    @Override
    public void feed(String food) {
        if (canEat.contains(food)) {
            System.out.println("Кошка кушает: " + food);
        } else {
            System.out.println("Кошка не хочет кушать " + food);
        }
    }
}
