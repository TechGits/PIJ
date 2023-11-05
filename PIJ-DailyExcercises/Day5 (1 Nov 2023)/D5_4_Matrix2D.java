public class D5_4_Matrix2D {   

    private int [][] data;
    private int rows, columns; // sets size of the array.

        public D5_4_Matrix2D(int rows, int cols){
            data = new int[rows][cols]; // putting the values of rows and cols, into the two data arrays.

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i][j] = 1;                    
                }
                
            }
            this.rows = rows;
            this.columns = cols;

        }
             public String toString() {
                String result = "[";
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result += data[i][j];
                        if (j < columns -1){
                            result +=",";
                        } else if (i < rows -1){
                            result += " | "; // Note: It would be cleaner to do result += " | ";
                        }
                    } 
                    
                }
                result += "] ";
                return result;

             }

             public void setRow (int rowNum, String rowStr){
                    String[] rowNumsArrStr = rowStr.split(",");
                    if (rowNum >= 0 && rowNum < rows && rowNumsArrStr.length == columns){

                        for (int i = 0; i < columns; i++) {
                            data[rowNum][i] = Integer.parseInt(rowNumsArrStr[i]);
                        }
                    }

                }
             public void setColumn (int colNum, String colStr){
                    String[] colNumsArrStr = colStr.split(",");
                    if (colNum >= 0 && colNum < columns && colNumsArrStr.length == rows){

                        for (int i = 0; i < rows; i++) {
                            data[i][colNum] = Integer.parseInt(colNumsArrStr[i]);
                        }
                    }
             }

            public void setELement (int row, int col, int value){
                if (row >= 0 && row < rows && col >= 0 && col < columns){
                    data[row][col] = value;
                }
            }

            public String prettyPrint() {
                String result = "";
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result += data[i][j];
                        if (j < columns -1){
                            result +="\t";
                        } else if (i < rows -1){
                            result += "\n"; 
                        }
                    }
                }

            return result;
            }
        
      }
