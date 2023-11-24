public class MobilePhone extends OldPhone{
    private int callsCounter = 0;


    void ringAlarm(String NokiaAlarmTone){
        System.out.println(NokiaAlarmTone+" alarm ringtone playing");
    }

    void playGame(String gameName){
        System.out.println("Playing "+gameName);
    }

    @Override
    public void call(String number) {
        super.call(number);
        callsCounter++;
    }

    public void printCallCounter(){
        System.out.println("Calls made: "+callsCounter);
    }

}
