import java.util.Scanner;

public class D5_10_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many spies needed for this mission?: ");
        int totalspies = scanner.nextInt();

        D5_10_Spy_InstanceCounter spy1 = new D5_10_Spy_InstanceCounter(111);
        D5_10_Spy_InstanceCounter spy2 = new D5_10_Spy_InstanceCounter(222);
        D5_10_Spy_InstanceCounter spy3 = new D5_10_Spy_InstanceCounter(333);
        D5_10_Spy_InstanceCounter spy4 = new D5_10_Spy_InstanceCounter(444);
        D5_10_Spy_InstanceCounter spy5 = new D5_10_Spy_InstanceCounter(555);
        D5_10_Spy_InstanceCounter spy6 = new D5_10_Spy_InstanceCounter(666);

        if (totalspies < D5_10_Spy_InstanceCounter.activeSpyCount) {
            spy1.getNumberOfActiveSpies();
        }
    }
}

