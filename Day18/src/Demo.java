//ByteArrayInputStream
import java.io.*;
public class Demo {
    public static void main(String [] args){
        String msg="देवगिरी";
        byte[] arr=msg.getBytes();
        ByteArrayInputStream ob;
        ob=new ByteArrayInputStream(arr);
        int x;
        do{
            x=ob.read();
            System.out.println((char)x);
        }while(x!=-1);
        System.out.println();
    }
}
