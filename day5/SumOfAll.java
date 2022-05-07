//Write a program   to find the sum of all elements of the array.
class SumOfAll{
public static void main(String args[]){

int[] arr= new int[] {2,3,4,7,5,6};

int sum=0;

for (int i=0;i<arr.length;i++)
{
  sum=sum+arr[i];
}
  System.out.println("Sum of all elements stored in the array is :"+ sum);
}
}

