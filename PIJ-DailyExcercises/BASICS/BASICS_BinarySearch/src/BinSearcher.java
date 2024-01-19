public class BinSearcher {
    private int target;

    public BinSearcher(int target){
        this.target = target;
    }




    //This function takes an array input only.
    public int binSearchFunction (int[] yourArray) {
        int left = 0;
        int right = yourArray.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (yourArray[mid] == target) {
                return mid; // Found target.
            } else if (yourArray[mid] < target) {
                left = mid + 1; // target probably in here.
            } else if (yourArray[mid] > target) {
                right = mid - 1; // target probably in here.
            }

        }
        return -1; // target not in array.

    }
    // This function displays if the target is in the array.
    public void displayBinSearchFunction(int result){
    if (result != -1) {
        System.out.println(target + " is in the array.");
    }else {
        System.out.println(target + " is not in the array.");
    }
    }
}

