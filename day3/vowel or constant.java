import java.util.*;
class VowelOrConstant{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a alphabet");
char ch =sc.next().charAt(0);
if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u'|| ch==' '){
 System.out.println("this alphabet is a vowel");
 }
 else{
 System.out.println("this alphabet is a constant");
 }
 }
 }
 

