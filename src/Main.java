import p1.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(3,"Барсик");
        cat.feed("яблоко");
        cat.feed("рыба");
        Animal dog = new Dog(1,"Шарик", true);
        dog.feed("корм для собак");
        Animal elephant = new Elephant(1,"Вася", 30);
        elephant.feed("горчицу");
        Animal wolf = new Wolf(1,"Вова");
        wolf.feed("горох");
        Animal hare = new Hare(1,"Эдик", 54);
        hare.feed("яблоко");
        Animal tiger = new Tiger(1,"Эдик", 150);
        tiger.feed("заяц");
    }

}