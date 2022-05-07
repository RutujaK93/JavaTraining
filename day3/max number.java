import java.util.*;
class MaxNumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int a,b,c,max;
System.out.println("Enter three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b){
System.out.println("a is max");
}
else if(b>c){
System.out.println("b is max");
}
else if(c>b){
System.out.println("c is max");
}
}
}  
