import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

public class Demo2 {
   public static void main(String[]args){
       HashMap<Integer,String> map2;
       map2=new HashMap<>();
       map2.put(10,"A");
       map2.put(20,"B");
       map2.put(30,"B");

   Set<Integer> keys;
        keys=map2.keySet();
        System.out.println("keys...");
        for(Integer k:keys){
        System.out.println(k);
            // #########################//#endregion
        }


        Collection<String> values;
        values=map2.values();
        System.out.println("Values...");

        for (String v:values){
        System.out.println(v);
        }
        System.out.println("Items...");

        Set<Entry<Integer,String>> items;
        items=map2.entrySet();
        for (Entry<Integer,String> e1:items){
        System.out.println(e1.getKey()+":"+e1.getValue());
        }
}
//
}
