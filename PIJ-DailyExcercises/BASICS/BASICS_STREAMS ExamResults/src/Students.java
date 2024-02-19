import java.nio.file.Paths;

public class Students {
    String studentName;
    int mark;


public Students (String studentName, int mark){
    this.studentName = studentName;
    this.mark = mark;
}

@Override
public String toString () {
    return studentName +": "+mark+"\n";
}
    public Classification examResult() {
        if (mark < 50) {
            return Classification.FAIL;
        } else if (mark < 60) {
            return Classification.PASS;
        } else if (mark < 70) {
            return Classification.MERIT;
        } else {
            return Classification.DISTINCTION;
        }
    }

    }
