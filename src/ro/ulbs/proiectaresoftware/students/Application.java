
package ro.ulbs.proiectaresoftware.students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {
    public static void main(String[] arg) {
        String inputFile = "studenti_in.txt";
        String outputFile = "studenti_out_sorted.txt";

        Set<Student> studentSet = new HashSet<>();

        try {
            Path inPath = Paths.get(inputFile);
            List<String> lines = Files.readAllLines(inPath);

            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length < 4) continue;

                int numarMatricol = Integer.parseInt(parts[0].trim());
                String prenume = parts[1].trim();
                String nume = parts[2].trim();
                String formatieDeStudiu = parts[3].trim();

                Student s = new Student(numarMatricol, prenume, nume, formatieDeStudiu);
                studentSet.add(s);
            }

            Student s1 = new Student(120, "Alis", "Popa", "TI21/2");
            Student s2 = new Student(112, "Maria", "Popa", "TI21/1");

            System.out.println("Student Alis prezent: " + verificaPrezenta(studentSet, s1));
            System.out.println("Student Maria prezent: " + verificaPrezenta(studentSet, s2));

            List<Student> studentsList = new ArrayList<>(studentSet);
            studentsList.sort(Comparator.comparing(Student::getFormatieDeStudiu)
                    .thenComparing(Student::getNume));

            List<String> outLines = new ArrayList<>();
            for (Student s : studentsList) {
                outLines.add(s.toString());
            }

            Files.write(Paths.get(outputFile), outLines);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }

    public static boolean verificaPrezenta(Set<Student> set, Student s) {
        return set.contains(s);
    }
}
