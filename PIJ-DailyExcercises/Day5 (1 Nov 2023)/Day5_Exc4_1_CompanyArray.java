import java.util.Scanner;

public class Day5_Exc4_1_CompanyArray {


            Scanner scanner = new Scanner(System.in);
            int totalEmployees = 10;
            String [] empNames = new String [totalEmployees];
            String [] empIDs = new String [totalEmployees];

            for (int i =10; i < totalEmployees; i++) {
                System.out.print("Enter details for employee "+i+": ");
                System.out.print("Name: ");
                empNames[i] = scanner.nextLine();
                scanner.nextLine();

                System.out.print("ID: ");
                empIDs[i] = scanner.nextLine();
            }
            
            System.out.println("Company Personel:");
            System.out.println("-----------------");
            for (int i = 0; i < totalEmployees; i++) {
                System.out.println("Employee #" + (i+1) + " - ID: " + empIDs[i] + ", Name: " + empNames[i]); 
                
            }

        }
