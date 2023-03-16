public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Plane fly = new Plane(747);
        fly.start();
        fly.takeOff();
        fly.changeHeight();
        fly.land();
        fly.turnOffEngine();

        Car drivy = new Car("bolide");
        drivy.start();
        drivy.accelarate();
        drivy.changeGear();
        drivy.brake();
        drivy.turnOffEngine();
        System.out.println("lets go again");

        FlyingCar flydry = new FlyingCar(500);
        flydry.start();
        flydry.accelarate();
        flydry.changeGear();
        flydry.changeHeight();
        flydry.land();
        flydry.turnOffEngine();

    }
}