//WHat does this do? Why might it be the case?
public class Day1_3_Weird_If {
    public static void main(String[] args) {
        
        int x = 1;
        if (x==2); {
            System.out.println("x is "+x);
        }
    }    
}
//** Answer: It does nothing except store the variable X on the heap.(it doesn't satisfy the condition of the x)