import java.util.ArrayList;

class Student implements Cloneable{
    ArrayList<String> ar;

    Student(){
        ar=new ArrayList<>();
    }
    Student(ArrayList<String> t){
        ar=t;
    }
    void loadData(){
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
    }
    void show(){
        System.out.println("=====================================");
        for (String s: ar){
            System.out.println("=================================");
        }
        @Override
                protected Object clone() throws CloneNotSupportedException{
            ArrayList<String> ar2;
        }
    }
}
public class Demo3 {
}
