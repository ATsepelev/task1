package p1;

public abstract class Animal {
    private Integer age;
    private String name;
    public Animal(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void feed(String food) {
        System.out.println("Кушает"+food);
    }

}
