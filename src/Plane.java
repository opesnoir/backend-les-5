public class Plane extends Vehicle implements Flyable{
    int plain;

    public Plane(int plain) {
        this.plain = plain;
    }

    @Override
    public void takeOff() {
        System.out.println("taking off");

    }

    @Override
    public void land() {
        System.out.println("landing");

    }

    @Override
    public void changeHeight() {
        System.out.println("changing height");

    }

    @Override
    void start() {
        System.out.println("get ready to fly");

    }

    @Override
    void turnOffEngine() {
        System.out.println("turning of engine");

    }
}
