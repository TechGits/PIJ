public class PrimeDivisorList {
    Integer num2Check = 0;
    public int number(){
        return num2Check;

    }

    public static boolean isPrime(Integer number){

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
        if (num2Check == null){
            throw new NullPointerException("Your number must not be null");
        } else if (!isPrime(num2Check)) {
            throw new IllegalArgumentException("Your number must be a prime number.");
        } else {
            Integer currentOcc= map.getorDefault(num2Check,0);
            map.put(num2Check, currentOcc + 1); //1 (key) exists 10 times (value)


        }

       }

   public void remove(Integer num2Check){
        if (map.containsKey(num2Check)){
            Integer currentOcc = map;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

