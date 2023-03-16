public class FlyingCar extends Vehicle implements Flyable, Drivable{
    int flyingCar;

    public FlyingCar(int flyingCar) {
        this.flyingCar = flyingCar;
    }

    @Override
    public void accelarate() {
        System.out.println("lets accelarate this flyingcar");

    }

    @Override
    public void brake() {
        System.out.println("brakeeeee");

    }

    @Override
    public void changeGear() {
        System.out.println("changing the gear of this beauty");

    }

    @Override
    public void takeOff() {
        System.out.println("now the flying car is ready to takeoff");

    }

    @Override
    public void land() {
        System.out.println("lets land this bird");

    }

    @Override
    public void changeHeight() {
        System.out.println("look at that the car is changing height");

    }

    @Override
    void start() {

    }

    @Override
    void turnOffEngine() {
        System.out.println("that was a nice ride and flight, let turn of the engine");

    }
}
