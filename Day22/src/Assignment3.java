//Create an ArrayList which will be able to store only numbers like int,float,double,etc,
//        but not any other data type.
import java.util.*;
public class Assignment3 {
    public static void main(String[]args){
        ArrayList<Integer> ar;
        ar=new ArrayList<>();
        ArrayList<Float> ar1;
        ar1=new ArrayList<>();
        ArrayList<Double> ar2;
        ar2=new ArrayList<>();
        ar.add(10 );
        ar1.add(2.5f );
        ar2.add(0.0);
        //ar2.add("S");
        Iterator<Integer> it;
        it=ar.iterator();
        Iterator<Float> it1;
        it1= ar1.iterator();
        Iterator<Double> it2;
        it2= ar2.iterator();
        while (it.hasNext() ){
            System.out.println(it.next());
        }
        while (it1.hasNext() ){
            System.out.println(it1.next());
        }
        while (it2.hasNext() ){
            System.out.println(it2.next());
        }

    }
}
