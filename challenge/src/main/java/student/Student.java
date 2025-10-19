package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = new Major();
        this.major.addStudent(this);
    }

    public String getFullNameFormatted(){
        return String.format("%S ,%S",this.secondName, this.firstName);
    }
    // Getters

    public String getCne(){
        return cne;
    }
    public Major getMajor(){
        return major;
    }

    // Setters

    public void setCne(String cne){
        this.cne = cne;
    }
    public void setMajor(Major major){
        this.major = major;
    }




}

