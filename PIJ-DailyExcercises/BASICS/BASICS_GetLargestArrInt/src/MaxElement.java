public class MaxElement {




    // This function takes yourArray input, , parses, and prints the index with highest number
    public void maxElement(int [] yourArray){
        int n = yourArray.length -1;
        int maxIndex = 0;
        for (int i = 1; i <= n ; i++) {
            if (yourArray[i] > yourArray[maxIndex]){
                    maxIndex = i;
            }

        }
        System.out.println("Index of the largest number is "+maxIndex);

    }







}
