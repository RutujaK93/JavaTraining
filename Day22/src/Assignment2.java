//Create an ArrayList which will be able to store only Strings.
//        Create a printAll method which will print all the elements using an Iterator
import java.util.*;
public class Assignment2 {
    public static void main(String[]args){
        ArrayList<String> ar;
        ar=new ArrayList<>();
        ar.add("This ");
        ar.add("Is ");
        ar.add("My ");
        ar.add("Second ");
        ar.add("Assignment");
        Iterator<String> it;
        it=ar.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
