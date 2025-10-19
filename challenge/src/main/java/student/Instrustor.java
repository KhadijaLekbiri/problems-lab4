package student;

public class Instrustor extends Person {
    private String employeeNumber;
    private Subject subject;

    public Instrustor(String employeeNumber, Subject subject){
        this.employeeNumber = employeeNumber;
        this.subject  = subject;
    }

    public String cleanEmployeeNumber(String employeeNumber){
        return employeeNumber.replaceAll(" ","");
    }
    public String normalizedCode(String employeeNumber){
        return String.format("%S",this.employeeNumber);
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",this.employeeNumber,this.secondName,this.firstName);
    }
    public String toCard(){
        StringBuilder res = new StringBuilder("Instructor\n----------\n");
        res.append(String.format("Employee #: %s\n",this.employeeNumber));
        res.append(String.format("Name    : %s, %s\n",this.secondName,this.firstName));
        res.append(String.format("Email   : %s\n",this.email));
        res.append(String.format("Phone   : %s\n",this.phone));
        return res.toString();
    }

    public String displayName(){
        StringBuilder res = new StringBuilder();
        if (this.firstName != null && this.secondName != null){
            res.append("FirstName: "+this.firstName+"\nLastName: "+this.secondName);
        }
        else if (this.firstName != null){
            res.append("FirstName: "+this.firstName);
        }
        else if (this.secondName != null){
            res.append("LastName: "+this.secondName);
        }
        return res.toString();

    }
}

