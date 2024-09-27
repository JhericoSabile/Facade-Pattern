public class Light implements HomeService {
    //A service class implementing the HomeService interface, responsible for turning the lights on and off.
    // It includes the turnOn() and turnOff() methods.
    @Override
    public void turnOn() {
        System.out.println("Lights are On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights is Off");
    }
}
