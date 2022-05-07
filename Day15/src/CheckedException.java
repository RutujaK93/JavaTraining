import java.io.FileInputStream;
import java.io.FileNotFoundException;
//unchecked Exception
class CheckedException{
    static void fun1()throws FileNotFoundException{
        try{
            FileInputStream fin;
            fin=new FileInputStream("C:\\Users\\ShreeGajanan Maharaj\\IdeaProjects\\Day15\\src");

        }
        catch (FileNotFoundException e){
            throw e;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException {
        fun1();
    }
}
