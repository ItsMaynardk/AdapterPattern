public class SmartphoneAdapter {
    private SmartPhoneCharger smartPhoneCharger;

    public SmartphoneAdapter (SmartPhoneCharger smartPhoneCharger) {
        this.smartPhoneCharger = smartPhoneCharger;
    }
    public String plugIn(){
        return smartPhoneCharger.chargePhone();
    }
}