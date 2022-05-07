// Write a program to read n number of values in an array and display it in reverse order. 
class reverseArray{
public static void main(String args[]){
int i;
//Scanner sc=new Scanner (System.in);
int[]arr= new int[]{2,5,7};
System.out.println("The values store into the array are :");
for (i=0;i<arr.length;i++)
{
System.out.println(arr[i]+ "");
}
System.out.println();
System.out.println("The values store into the array in reverse are : ");
for ( i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]+ "");
}
}
}




