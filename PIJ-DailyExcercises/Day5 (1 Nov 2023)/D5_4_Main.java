public class D5_4_Main {
    public static void main(String[] args) {
        
        D5_4_Matrix2D newMatrix = new D5_4_Matrix2D(5, 5);
        // newMatrix.setELement(0, 1, 37);
        // newMatrix.setRow(0,"1,2,3,4,5");
        newMatrix.setColumn(0,"1,2,3,4,5");
        System.out.println(newMatrix.prettyPrint());

    }
    
}
