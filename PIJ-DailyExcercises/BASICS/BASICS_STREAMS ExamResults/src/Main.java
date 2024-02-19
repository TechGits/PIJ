import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Students> pijStudents = new ArrayList<>(Arrays.asList(
                new Students("Ricki", 50),
                new Students("Maria", 86),
                new Students("Charlie", 63),
                new Students("Donavan", 23),
                new Students("Lisa", 61),
                new Students("Oscar", 92),
                new Students("Faris", 36),
                new Students("Philo", 67),
                new Students("Peter", 54),
                new Students("Xavier", 60),
                new Students("David", 70),
                new Students("Milli", 68),
                new Students("Alice", 51),
                new Students("Zach", 56),
                new Students("Alanah", 42)));


        List <Students> failStudents = pijStudents.stream()
                .filter (student -> student.mark <50)
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());
        System.out.print("FAIL: ");
        failStudents.forEach(student -> System.out.print(student.studentName+" "+student.mark+", "));

        List <Students> passStudents = pijStudents.stream()
                .filter((student -> student.mark >= 50 & student.mark <= 59))
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());
        System.out.print("\nPASS: ");
        passStudents.forEach((student -> System.out.print(student.studentName+" "+student.mark+", ")));


        List<Students> meritStudents = pijStudents.stream()
                .filter(student -> student.mark >= 60 && student.mark <= 69)
                .collect(Collectors.toList());

        System.out.print("\nMERIT: ");
        meritStudents.forEach((student -> System.out.print(student.studentName+" "+ student.mark+", ")));


        List<Students> distStudents = pijStudents.stream()
                .filter((student -> student.mark >= 70))
                .sorted(Comparator.comparing(mark -> mark.mark))
                .collect(Collectors.toList());

        System.out.print("\nDISTINCTION: ");
        distStudents.forEach((student -> System.out.print(student.studentName+" "+student.mark+", ")));



    }
}