//Create a class that captures students. 
//Each student has a first name, last name, class year, and major. 
//Create two examples of students.
class Student{
String fname;
String lname;
int class_year;
String major;
 
Student(String fname,String lname,int class_year,String major){
   this.fname=fname;
   this.lname=lname;
   this.class_year=class_year;
   this.major=major;
   
}
}
void printDetails(){
System.out.println("First name: "+fname);
System.out.println("Last name: "+lname);
System.out.println("Class year: "+class_year);
System.out.println("Student major: "+major);
}
public class Assig1{
public static void main(String[]args){
Student s1=new Student("Rutuja","Kakade",4,"English");
Student s2=new Student();
s1.printDetails();
}
}
}
}

