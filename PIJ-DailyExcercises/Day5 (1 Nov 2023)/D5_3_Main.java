import java.util.Scanner;

public class D5_3_Main {
    public static void main(String[] args) {  
        int [] source = new int[2];
        int [] dest = new int[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < source.length; i++) {
            System.out.print("Enter number "+ (i+1)+": ");
            source[i] = scanner.nextInt();                     
        }
          D5_3_ArrayCopierbyHand instanceArray = new D5_3_ArrayCopierbyHand(source, dest);

          if (source.length == dest.length){
            instanceArray.myarrayCopy();                          
            instanceArray.printNewCopy();
            
          } else {
            instanceArray.printOldCopy();
          }
          

        
     
        }  

        }
         
        
       

    
    
    
