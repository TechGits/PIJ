public class Main {
    public static void main(String[] args) {
        Box_Revisited<Integer,String,Boolean,Double> myBox = new Box_Revisited<>(34,"s34er",true,33.3);
        System.out.println(myBox.getData1()+" "+myBox.getData2()+" "+myBox.getData3()+" "+ myBox.getData4());
    }
}