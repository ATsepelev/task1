package p3;

public abstract class Bike {
    private Motor motor;
    private Battery battery;

    public Bike(Motor motor, Battery battery) {
        this.motor = motor;
        this.battery = battery;
    }
}
