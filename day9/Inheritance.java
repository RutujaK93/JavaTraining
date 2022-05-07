class A{
void show(){
System.out.println("In base");
}
class B extends A{
void disp(){
System.out.println("In derived");
}
}

public class Inheritance{
public static void main (String [] args){
B ob= new B();
ob.show();
ob.disp();
}
}
}