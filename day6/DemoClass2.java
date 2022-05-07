class Test{
int i;           //instance variable
static int j;    //static variable

Test(){
i=i+1;
j=j+1;
}
void show(){
System.out.println(i);
System.out.println(j);
}
}
public class DemoClass2{
public static void main(String[]args){
Test t1=new Test();
Test t2=new Test();
Test t3=new Test();
t1.show();
t2.show();
t3.show();
}
}





 