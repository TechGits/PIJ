public class Matrix2D {
    
       private int [] [] data;
       private int rows, cols;
      

public Matrix2D (int rows, int cols){
    data = new int[rows][cols];
    
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        data [i][j] = 1;
    }
}
this.rows = rows;
this.cols = cols;
    }
    
public String toString(){
    String result = "";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result+= data [i][j];
            if (j < cols -1) {
                result += ",";
            } else  if (i < rows -1);
            {}
                
            }
            
        }


        return result;
    }
    


    //setElement
    public void setElement(int row, int col, int value){
        if (row > 0 &&  row < rows && col >= 0 && col);

        }
    }
}
