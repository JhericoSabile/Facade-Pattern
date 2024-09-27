public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Aircon is Turn On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Aircon is Turn Off!");
    }
}