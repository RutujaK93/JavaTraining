import java.util.*;
class Leapyear{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int year;
System.out.println("Enter year");
year=sc.nextInt();
if(((year % 4==0)  && (year%100!=0))||(year%400==0)){
System.out.println("It is a leap year");
}
else{
System.out.println("Not a leap year");
}
}
}
