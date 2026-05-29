package lab10;

import ro.ulbs.proiectaresoftware.students.Student;
import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport {
    private String fileName;

    public StudentiInFisierXlsx(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {
        System.out.println( fileName);

    }
}
