public class MobilePhone extends OldPhone{
    private Battery battery  = new Battery();
    private int callsCounter = 0;

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    void ringAlarm(String NokiaAlarmTone){
        System.out.println(NokiaAlarmTone+" ringtone playing");
    }

    void playGame(String gameName){
        battery.decreaseLevel();
        System.out.println("Playing "+gameName);
    }

        @Override
    public void call(String number) {
        super.call(number);
            battery.decreaseLevel();
            callsCounter++;
    }

    public void printBatteryLevel(){
        System.out.println("Battery level : "+battery.getLevel());
    }
    public void printCallCounter(){
        System.out.println("Calls made: "+callsCounter);
    }

}
