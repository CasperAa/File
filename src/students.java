public class students {

    private String studentEmail, studentName;

    public students (String studentEmail, String studentName){
        this.studentEmail = studentEmail;
        this.studentName = studentName;
    }

    public String getStudentEmail(){
        return studentEmail;
    }

    public String getStudentName(){
        return studentName;
    }
}
