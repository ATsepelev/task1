package p3;

public class Gazelle extends Car{
    private Integer passengersNum;

    public Gazelle(Motor motor, Battery battery, Integer passengersNum) {
        super(motor,battery);
        this.passengersNum = passengersNum;
    }
}
