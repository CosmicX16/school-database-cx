import java.util.*;
public class Main {
    // all input goes here
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>(0);
        ArrayList<Student> students = new ArrayList<>(0);
        School LBSS = new School("Lord Byng Secondary", "Point Grey", 1000);
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            String n = String.valueOf(i+1);
            School.addStudent(students, "Student", n, 8);
        }
        for(int i = 0; i < 3; i++){
            String n = String.valueOf(i+1);
            School.addTeacher(teachers, "Teacher", n, "Subject " + n);
        }
        LBSS.readTeacher(teachers);
        LBSS.readStudent(students);
        School.delStudent(students);
        School.delStudent(students);
        School.delTeacher(teachers);
        LBSS.readTeacher(teachers);
        LBSS.readStudent(students);
    }


}

