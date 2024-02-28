import java.util.ArrayList;
//this class holds the school class which contains teacher and student type objects
//this class can edit said objects with specific methods
public class School {
    //class unique fields
    String name;
    String catchment;

    int studentamount;
    //constructors
    School(){
     name = "Sample School";
     catchment = "Sample Area";
     studentamount = 100;
    }
    School(String n, String c, int s){
        this.name = n;
        this.catchment = c;
        this.studentamount = s;
    }
    //getters and setters
    public String getName(){
        return (name);
    }
    public void setName(String s){
        name = s;
    }
    public String getCatchment(){
        return (catchment);
    }
    public void setCatchment(String s){
        catchment = s;
    }
    public void setStudentAmount(int s) { studentamount = s;}
    public int getStudentAmount() { return (studentamount);}
    //adds a teacher to school object
    public static void addTeacher(ArrayList<Teacher> n, String pro, String sur, String subject){
        Teacher fella = new Teacher(pro,sur,subject);
        n.add(fella);
    }
    // adds student to school object
    public static void addStudent(ArrayList<Student> n, String pro, String sur, int grade){
        if(grade > 12){
            System.out.println("bad input");
        } else {
            Student fella = new Student(pro, sur, grade);
            n.add(fella);
        }
    }
    //displays in console a list of all teachers
    public void readTeacher(ArrayList<Teacher> n ){
        for(int i = 0; i < n.size(); i++){
            System.out.print("Name: "+ n.get(i).getName());
            System.out.println(" Subject: " +n.get(i).getSub());


        }
        System.out.println("_______________________________");
    }
    //displays in console a list of all students
    public void readStudent(ArrayList<Student> n ){
        for(int i = 0; i < n.size(); i++){
            System.out.print("Name: "+ n.get(i).getName());
            System.out.print(" Grade: " +n.get(i).getGrade());
            System.out.println(" Student Number: "+n.get(i).getNumber());

        }
        System.out.println("_______________________________");
    }
    //removes a teacher from the school object
    public static void delTeacher(ArrayList<Teacher> n){
        int m = n.size();
        n.remove(m-1);
    }
    //removes student from the school object
    public static void delStudent(ArrayList<Student> n){
        int m = n.size();
        n.remove(m-1);
    }
}
