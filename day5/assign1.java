//Write a program   to store elements in an array and print it. 
import java.util.*;
class assign1{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int[] arr= new int[10];
System.out.println("enter array");
int i;
for (i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("Element in array are:");

for(i=0;i<arr.length;i=i+1)
{
System.out.print( arr[i]);
}
}
}
