package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students = new Student[50];
    private static Student[] csStudents = new Student[50];
    private int studentCount;

    public Major() {
        this("23","computer science");
    }
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
    }
    // Method to add a student
    public void addStudent(Student s) {
        if (this.code == "23"){
            Major.csStudents[this.studentCount] = s;
            this.studentCount++;
            return;
        }
        this.students[this.studentCount] = s;
        this.studentCount++;
    }

    public Student findStudentByCNE(String cne){
        if (this.code == "23")
            this.students = Major.csStudents;
        int i = 0;
        while (i < this.studentCount){
            if (this.students[i].getCne() == cne)
                return this.students[i];
            if (this.students[i] != null)
                i++;
        }
        return null;
    }

    public boolean removeStudent(String cne){
        Student stud = this.findStudentByCNE(cne);
        if (stud==null)
            return false;
        stud  = null;
        this.studentCount--;
        return true;
    }

    public double getOccupancyRate(){
        return this.studentCount/50;
    }

    public StringBuilder getStudentListAsString(){
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < this.studentCount){
            result.append(Person.toString(this.students[i]));
            if (this.students[i] != null)
                i++;
        }
        return result;
    }
    // Getters
    public int getId(){
        return id;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public Student[] getStudents(){
        return students;
    }
    public int getStudentCount(){
        return studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println(String.format("The list of students in the %s major is: %d",this.name,this.studentCount));
        if (this.code == "23")
            this.students = Major.csStudents;
        int i = 0;
        while (i < this.studentCount){
            System.out.print(Person.toString(this.students[i]));
            if (this.students[i] != null)
                i++;
        }
    }


}
