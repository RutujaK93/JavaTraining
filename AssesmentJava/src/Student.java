/*Create a class that captures students. Each student has a first name, last name, class year, and major.
        Declare these variables as private and provide getter and setter methods for these variables
        Create two examples of students(means create 2 objects of Student class).

        NOTE : Do not take input from keyboard. Set the values by using setter method and to get values use getter method*/
import java.lang.String;
class StudentInfo{
    private String Fname;
    private String Lname;
    private int class_year;
    private String major;

    public String getFname(){
        return Fname;
    }
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    public String getLname(){
        return Lname;
    }
    public void setLname(String Lname){
        this.Lname=Lname;
    }
    public int getClass_year(){
        return class_year;
    }
    public void setClass_year(){
        this.class_year=class_year;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }



}
public class Student {
    public static void main(String[]args){
        StudentInfo ob1= new StudentInfo();
        StudentInfo ob2=new StudentInfo();
        ob1.setFname("rutuja");
        System.out.println(ob1.getFname());
        ob1.setLname("kakade");
        System.out.println(ob1.getLname());
        ob1.setClass_year();
        System.out.println(ob1.getClass_year());
        ob1.setMajor("Electronics");
        System.out.println(ob1.getMajor());

        ob2.setFname("Pranav");
        System.out.println(ob1.getFname());
        ob2.setLname("kakade");
        System.out.println(ob1.getLname());
        ob2.setClass_year();
        System.out.println(ob1.getClass_year());
        ob2.setMajor("science");
        System.out.println(ob1.getMajor());
    }

}
