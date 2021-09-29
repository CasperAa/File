import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowStudents {
    public static void main(String[] args) throws FileNotFoundException {

        File students = new File("Files/Students.csv");

        Scanner readStudents = new Scanner(students);
        Scanner userName = new Scanner(System.in);

        System.out.println("What is you first name?");
        String nameOfUser = userName.nextLine();

        ArrayList<students> allStudents = new ArrayList<students>();


        while (readStudents.hasNext()) {

            String currentStudent = readStudents.nextLine();
            if (currentStudent.contains(nameOfUser)) {
                System.out.println("\n" + currentStudent + " <-- you are here!\n");
            } else {
                System.out.println(currentStudent);
            }

            String [] lineAsArray = currentStudent.split(";");
            String studentEmail = lineAsArray[0];
            String studentName = lineAsArray[1];
            students newStudent = new students(studentEmail, studentName);
            allStudents.add(newStudent);

        }
        System.out.println("\nAll students in Dat21v2 is shown above!");

        System.out.println(allStudents.size());
    }
}
