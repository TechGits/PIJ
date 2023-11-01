public class ArrayChecker {

    // Symmetrical Methood
    public boolean isSymmetrical (int[] array){

        for (int i = 0; i < array.length/2; i++) { // for Symmetry
            if (array[i] != array[array.length - 1  - i]){
                return false;

            } 
            return true;
        }
    }
     
        // Reverse Method
    // public int [] reverse (int [] array2){

    //     int [] result = new int [array2.length];
    //         for (int i = 0; i < array2.length; i++) {
    //             result [array2.length -  2 - i ] = array[i];
            
    //     }
    //     return result;

    // } 
    
    
}
