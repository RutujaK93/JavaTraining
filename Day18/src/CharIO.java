import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
1. WAP to copy the content of one file to another by using CHAR IO classes.
*/
public class CharIO {
    public static void main(String[] args) throws Exception{
        FileReader fin = new FileReader("C:\\Users\\ShreeGajanan Maharaj\\IdeaProjects\\Day17\\Test2.txt");
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter("C:\\Users\\ShreeGajanan Maharaj\\IdeaProjects\\Day17\\Test.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        int x;
        do{
            x = bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while (x!=-1);
        bin.close();
        bout.close();
        System.out.println("File Copied");
    }
}

