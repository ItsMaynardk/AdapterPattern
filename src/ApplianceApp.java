public class ApplianceApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();

        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartPhoneCharger);

        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());
    }
}