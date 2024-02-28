public class Teacher {
    //class for the teacher object including related methods
    //class fields
    String firstName;
    String lastName;
    String subject;
    //default constructor
    Teacher(){
        firstName = "Teacher";
        lastName = "Sample";
        subject = "N/A";
    }
    //specific constructor
    Teacher(String first,String last, String sub){
        this.firstName = first;
        this.lastName = last;
        this.subject = sub;
    }
    //getters and setters
    public String getName(){
        return (firstName+" "+lastName);
    }
    public String getSub(){
        return(subject);
    }
    public void setSubject(String s){
        subject = s;
    }
    public void setName(String s){
        String[] firstLast = s.split(" ");
        firstName = firstLast[0];
        lastName = firstLast[1];
    }
}
