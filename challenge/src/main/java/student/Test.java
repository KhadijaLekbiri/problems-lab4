package student;

public class Test {
    public static void main(String[] args) {
        Major major1 = new Major("20","Architecture");
        Major major2 = new Major("15","Medicine");
        Major major3 = new Major("23","computer science");
        Student student1 = new Student("SAFI", "Amal","0661738292","user1@gmail.ma","BJ25542",major3);
        Student student2 = new Student("ALAMI", "Samir","0667843292","user2@gmail.ma","JE46549", major3);
        Student student3 = new Student("Ali", "Saad","060043292","user3@gmail.ma","J488849",major2);
        Student student4 = new Student("Alaoui", "Saida","05663292","user4@gmail.ma","YT48232",major1);

        major1.displayStudents();
        major2.displayStudents();
        major3.displayStudents();
        //for (int i = 0; i < 25;i++)
          //  new Student();

        System.out.print(major3.getStudentListAsString());
        System.out.println(major3.getOccupancyRate()+"%");

        major3.removeStudent("JE46549");

        // Display computer science students
        System.out.print(major3.getStudentListAsString());

    }
}

