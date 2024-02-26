public class ExamResults {
    String studentName;
    int mark;


public ExamResults(String studentName, int mark){
    this.studentName = studentName;
    this.mark = mark;
}

@Override
public String toString () {
    return studentName +": "+mark+"\n";
}
    public Classification examResult() {
        if (mark < 0 || mark >100){
            throw new IllegalArgumentException(mark + " is an illegal value. Please enter a number between 0 and 100");
        }
        else if (mark < 50) {
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
