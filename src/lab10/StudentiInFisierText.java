package lab10;

import lab7.Student;
import java.util.List;

public class StudentiInFisierText implements IStudentiExport {
    private String fileName;

    public StudentiInFisierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {
        System.out.println( fileName);

    }
}
