package objectsAndClassesExerciseStudens;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <=countStudents ; i++) {
            String data = scanner.nextLine();
            String [] parts = data.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            double grade = Double.parseDouble(parts[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
