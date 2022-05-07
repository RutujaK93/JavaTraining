import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo1 {
    public static void main(String[]args){
        TreeMap<Integer,String> map1;
        map1=new TreeMap<>();
        map1.put(10,"A");
        map1.put(20,"B");
        map1.put(30,"C");
        map1.put(40,"D");
        map1.put(50,"B");
        System.out.println(map1);
        //read all keys


        Set<Integer> keys;
        keys=map1.keySet();
        System.out.println("keys...");
        for(Integer k:keys){
            System.out.println(k);
        }


        Collection<String> values;
        values=map1.values();
        System.out.println("Values...");

        for (String v:values){
            System.out.println(v);
        }
        System.out.println("Items...");

        Set<Entry<Integer,String>> items;
        items=map1.entrySet();
        for (Entry<Integer,String> e1:items){
            System.out.println(e1.getKey()+":"+e1.getValue());
        }
    }
}