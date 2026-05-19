package lab7;

public  class Student {
    private String name;
    private int age;
    private String address;
    private String studyGroup;

    public Student(String name, int age, String address, String studyGroup) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studyGroup = studyGroup;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    private int id;
    private String prenume;
    private String nume;
    private String grupa;
    private double nota;


    public Student(int id, String prenume, String nume, String grupa, double nota) {
        this.id = id;
        this.prenume = prenume;
        this.nume = nume;
        this.grupa = grupa;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public double getNota() {
        return nota;
    }

    public Student moveToGroup(String newGroup) {
        return new Student(this.name, this.age, this.address, newGroup);
    }

    @Override
    public String toString() {

        if (this.prenume != null) {
            return "Student Lab10 {" +
                    "id=" + id +
                    ", nume='" + prenume + " " + nume + '\'' +
                    ", grupa='" + grupa + '\'' +
                    ", nota=" + nota +
                    '}';
        } else {

            return "Student Lab7 {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", studyGroup='" + studyGroup + '\'' +
                    '}';
        }
    }
}

