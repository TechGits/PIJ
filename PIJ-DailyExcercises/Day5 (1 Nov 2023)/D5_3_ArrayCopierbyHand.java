public class D5_3_ArrayCopierbyHand {
    private int[] source;
    private int[] dest;


    public D5_3_ArrayCopierbyHand (int[] source, int[] dest){
        this.source = source;
        this.dest = dest;

    }

    public int[] getDest() {
        return dest;
    }

    public void myarrayCopy(){
        for (int i = 0; i < source.length; i++){
        dest[i] = source[i];
    }
}
    public void printOldCopy(){
        for (int i : source){
            System.out.println("Old Array is: "+i);
        }
    }

        public void printNewCopy(){
           for (int j : dest){           
                System.out.println("New array is: "+ j);
           }
            
        
    }


}