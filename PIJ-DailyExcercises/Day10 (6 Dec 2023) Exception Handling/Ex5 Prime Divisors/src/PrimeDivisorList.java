public class PrimeDivisorList {
    Integer num2Check = 0;
    public int number(){
        return num2Check;

    }

    public boolean isPrime(Integer number){

        if (number <=1){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i==0) {
                    return false;
                }
            }return true;
        }
    }

    public static void add(Integer num2Check){
       }

   public void remove(Integer num2Check){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

