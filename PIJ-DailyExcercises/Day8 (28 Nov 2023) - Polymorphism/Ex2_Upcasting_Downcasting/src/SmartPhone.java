public class SmartPhone extends MobilePhone{

    public SmartPhone(String acme) {
        super();
    }

    public void browseWeb(String url){
        System.out.println("Browsing "+url);
        }
    public String getLocation(){
    return "Birkbeck, University of London";
    }

    /**
     * @param number
     */
    @Override
    public void call(String number) {
        super.call(number);
        if (number.contains ("00")){
            System.out.println("...calling "+number+" through the net to save money.");
        }
    }
}
