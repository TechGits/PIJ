import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ExamResults> pijStudents = new ArrayList<>(Arrays.asList(
                new ExamResults("Ricki", 50),
                new ExamResults("Maria", 86),
                new ExamResults("Charlie", 63),
                new ExamResults("Donavan", 23),
                new ExamResults("Lisa", 61),
                new ExamResults("Oscar", 92),
                new ExamResults("Faris", 36),
                new ExamResults("Philo", 67),
                new ExamResults("Peter", 54),
                new ExamResults("Xavier", 60),
                new ExamResults("David", 70),
                new ExamResults("Milli", 68),
                new ExamResults("Alice", 51),
                new ExamResults("Zach", 56),
                new ExamResults("Alanah", 42),
                new ExamResults("Yonita", 101),
                new ExamResults("Larry", -43)));



        List <ExamResults> failStudents = pijStudents.stream()
                .filter (student -> student.mark <50)
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());
        System.out.print("FAIL: ");
        failStudents.forEach(student -> System.out.print(student.studentName+" "+student.mark+", "));

        List <ExamResults> passStudents = pijStudents.stream()
                .filter((student -> student.mark >= 50 & student.mark <= 59))
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());
        System.out.print("\nPASS: ");
        passStudents.forEach((student -> System.out.print(student.studentName+" "+student.mark+", ")));


        List<ExamResults> meritStudents = pijStudents.stream()
                .filter(student -> student.mark >= 60 && student.mark <= 69)
                .collect(Collectors.toList());

        System.out.print("\nMERIT: ");
        meritStudents.forEach((student -> System.out.print(student.studentName+" "+ student.mark+", ")));


        List<ExamResults> distStudents = pijStudents.stream()
                .filter((student -> student.mark >= 70))
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());

        System.out.print("\nDISTINCTION: ");
        distStudents.forEach((student -> System.out.print(student.studentName+" "+student.mark+", ")));



    }
}