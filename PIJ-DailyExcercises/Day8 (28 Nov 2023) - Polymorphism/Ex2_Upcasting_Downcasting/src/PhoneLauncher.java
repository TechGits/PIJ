public class PhoneLauncher {
        public void launch(){
            SmartPhone smartPhone = new SmartPhone("ACME");
            smartPhone.browseWeb("www.bbk.ac.uk");
            System.out.println(smartPhone.getLocation());

            smartPhone.ringAlarm("Alarm 1");
            smartPhone.playGame("Space Invaders");

            smartPhone.call("001");
            smartPhone.call("012");
            smartPhone.call("003");
            smartPhone.call("004");
            smartPhone.call("005");
            smartPhone.call("006");
            smartPhone.printBatteryLevel();


            smartPhone.printCallCounter();
        }
}
