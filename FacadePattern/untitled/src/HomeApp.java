public class HomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();
        AirConditioning ac = new AirConditioning();
        HomeInterface home = new HomeInterface(light, tv, ac);

        home.turnOnAll();
        home.turnOffAll();
    }
}