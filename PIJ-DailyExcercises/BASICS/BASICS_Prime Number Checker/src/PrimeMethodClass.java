public class PrimeMethodClass {
    int num2Check = 0;
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
}
