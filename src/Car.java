public class Car extends Vehicle implements Drivable{
    String car;

    public Car(String car) {
        this.car = car;
    }

    @Override
    public void accelarate() {
        System.out.println("let's accelarate");

    }

    @Override
    public void brake() {
        System.out.println("braking");

    }

    @Override
    public void changeGear() {
        System.out.println("changing gear");

    }

    @Override
    void start() {
        System.out.println("get ready to drive");

    }

    @Override
    void turnOffEngine() {
        System.out.println("that was a nice ride, now turn of the engine");

    }
}
