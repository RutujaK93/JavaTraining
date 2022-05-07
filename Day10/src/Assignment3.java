public class Assignment3 {
    public static void main (String[] args){
        class Person{
            String name;
            String address;
            Person(String name, String address){
                this.name=name;
                this.address=address;
            }

        }
        class Student extends Person{
            int sid;
        }
        class Teacher extends Person{
            int tid;
            int salary;
            String subject;
        }
        class CollegeStudent extends Student{
            int year;
            String major;
        }
    }
}
