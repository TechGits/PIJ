public class PhoneLauncher {
    public static void main(String[] args) {
        public void launch() {
            SmartPhone smartPhone = new SmartPhone();
            smartPhone.browseWeb("www.bbk.ac.uk");
            System.out.println(smartPhone.getLocation());

            smartPhone.ringAlarm("Alarm 1");
            smartPhone.playGame("Space Invaders");

        }
        }
}
