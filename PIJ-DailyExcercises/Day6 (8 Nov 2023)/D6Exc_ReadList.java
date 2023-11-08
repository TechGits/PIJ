/*Exercise
Make a class that implements a method that reads a list of marks
 between 0 and 100 from the user, one per line, and stops when the
  user introduces a -1. The program should output at the end 
  (and only at the end) how many marks there were in total, 
  how many were distinctions (70–100), how many were passes 
  (50–69), how many failed (0–49), and how many were invalid 
  (e.g., 150 or -3). Write exactly one call to method nextInt() 
  from class java.util.Scanner in your code.
 */

public class D6Exc_ReadList {

    private int userNum;
    private int dist = 0;
    private int merit = 0;
    private int pass = 0;
    private int fail = 0;           
    private int end = -1;

    public D6Exc_ReadList (int userNum){

    }

    /* Retuns how many marks were in the range 70 - 100 */
    public int getDist() {
    return dist;

    }
    /* Retuns how many marks were in the range 60 - 69 */
    public int getMerit(){
        return merit;
    }

    /* Retuns how many marks were in the range 50 - 59 */
    public int getPass(){

        return pass;
    }
    /* Retuns how many marks were a fail 0 - 49 */
    public int getFail(){
    return fail;
    } 

    public void  calcMarks (int userNum) {
        if (userNum < 50){
            fail++;            
        } else if (userNum >= 50 && userNum <60){

        pass++;
        } else if (userNum >= 60 && userNum < 70){
         merit++;
        } else {
             dist++;
        }
      

      
    }
    }
    
    

