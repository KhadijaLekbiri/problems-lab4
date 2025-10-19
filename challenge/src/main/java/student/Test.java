package student;

public class Test {
    public static void main(String[] args) {
        // Create majors
        Major major1 = new Major("20","Architecture");
        Major major2 = new Major("15","Medicine");
        Major major3 = new Major("23","Computer Science");

        // Create students
        Student student1 = new Student("SAFI", "Amal","0661738292","user1@gmail.ma","BJ25542",major3);
        Student student2 = new Student("ALAMI", "Samir","0667843292","user2@gmail.ma","JE46549", major3);
        Student student3 = new Student("Ali", "Saad","060043292","user3@gmail.ma","J488849",major2);
        Student student4 = new Student("Alaoui", "Saida","05663292","user4@gmail.ma","YT48232",major1);

        // Display students per major
        major1.displayStudents();
        major2.displayStudents();
        major3.displayStudents();

        // Show computer science student list and occupancy
        System.out.println("CS Students: \n" + major3.getStudentListAsString());
        System.out.println("Occupancy Rate: " + major3.getOccupancyRate() + "%");

        // Remove a student
        major3.removeStudent("JE46549");
        System.out.println("After removing JE46549: " + major3.getStudentListAsString());

        // --- New lines to test Instructor and Subject ---

        // Create subjects
        Subject subj1 = new Subject();
        subj1.setCode("CS101");
        subj1.setTitle("intro to programming");

        Subject subj2 = new Subject();
        subj2.setCode("MED201");
        subj2.setTitle("Human Anatomy");

        // Create instructors
        Instrustor instr1 = new Instrustor("E123", subj1);
        instr1.firstName = "Alice";
        instr1.secondName = "Johnson";
        instr1.email = "alice.johnson@uni.edu";
        instr1.phone = "066112233";

        Instrustor instr2 = new Instrustor("E456", subj2);
        instr2.firstName = "Bob";
        instr2.secondName = "Smith";
        instr2.email = "bob.smith@uni.edu";
        instr2.phone = "066445566";

        // Display instructor cards
        System.out.println("\nInstructor Cards:");
        System.out.println(instr1.toCard());
        System.out.println(instr2.toCard());

        // Display syllabus line
        System.out.println("\nSyllabus Lines:");
        System.out.println(subj1.syllabusLine(instr1));
        System.out.println(subj2.syllabusLine(instr2));

        // Check if intro course
        System.out.println("\nIs " + subj1.getTitle() + " an intro course? " + subj1.isIntroCourse());
        System.out.println("Is " + subj2.getTitle() + " an intro course? " + subj2.isIntroCourse());
    }
}
