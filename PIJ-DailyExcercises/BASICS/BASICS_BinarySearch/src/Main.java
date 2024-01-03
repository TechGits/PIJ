public class Main {
    public static void main(String[] args) {

        BinSearcher myBinSearch = new BinSearcher(50);
         int[] yourArray= {10,20,30,40,50,60,70,80,90,100};

         int result = myBinSearch.binSearchFunction(yourArray);


         myBinSearch.displayBinSearchFunction(result);


    }
}