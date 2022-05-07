//RandomAccesFile
import java.io.*;
public class Demo4 {
public static void main(String[]args) throws Exception{
    RandomAccessFile ob;
    ob=new RandomAccessFile("C:\\Users\\ShreeGajanan Maharaj\\IdeaProjects\\Day18\\Test2.txt","rw");
    ob.seek(8);
    //ob.seek(0);
    int x;
    do{
        x=ob.read();
        if(x!=-1) {
            System.out.print((char) x);
        }
        }while (x!=-1);
        ob.close();
        System.out.println();

    }
}

