public class Student {
    //class for the student object and related methods

    //fields
    String firstName;
    String lastName;
    int grade;

    int pin;
    //getters and setters
    public String getName(){
        return (firstName+" "+lastName);
    }
    public void setName(String s){
        String[] firstLast = s.split(" ");
        firstName = firstLast[0];
        lastName = firstLast[1];
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int i){
        if(i>0 && i<13) {
            grade = i;
        } else {
            System.out.println("bad input");
        }
    }
    public int getNumber(){
        return pin;
    }
    public void setNumber(int i){
        if(!(i >= 10000000) && !(i<1000000)){
            pin = i;
        }else{
            System.out.println("bad input");
        }

    }
    //constructors
    Student(){
        firstName = "Student";
        lastName = "Example";
        grade = 12;
    }
    Student(String first,String last, int grade){
        this.firstName = first;
        this.lastName = last;
        this.grade = grade;
        this.pin = (((int)(Math.random()*1000)*10000)+((int)(Math.random()*10000)));
    }

}
