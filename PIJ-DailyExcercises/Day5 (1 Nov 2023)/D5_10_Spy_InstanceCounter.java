
    public class D5_10_Spy_InstanceCounter {
    private int spyID;
    private boolean isActive;
    private static int activeSpyCount = 0; // Declare as static to count active spies across all instances

    public D5_10_Spy_InstanceCounter(int spyID) {
        this.spyID = spyID;
        activeSpyCount++;
    }

    public int getSpyID() {
        return spyID;
    }

    public int setSpyId() {
        return spyID;
    }

    public int getNumberOfActiveSpies() {
        System.out.println(spyID + " is active");
        System.out.println("There are " + activeSpyCount + " spies active.");
        return activeSpyCount;
    }

    public void retire(int spyID) { // Changed the return type to void
        System.out.println("Agent " + spyID + " has retired.");
        activeSpyCount--;
        System.out.println("There are " + activeSpyCount + " active spies");
    }
}
