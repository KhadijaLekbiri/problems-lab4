package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){};
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setPhone(String telephone){
        this.phone = telephone;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public static String toString(Object obj){
        Person person = (Person) obj;
        return String.format("%s. %s %s %s \n",person.getId(),person.getPhone(),person.getSecondName(),person.getFirstName());
    }

}

