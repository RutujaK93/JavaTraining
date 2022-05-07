//Write a Java program to calculate the average value of array elements. 

class SumOfAll{
public static void main(String args[]){

double[] arr= new double[] {2,3,4,7,5,6,10};

double sum=0; 
double average=0;

for (int i=0;i<arr.length;i++)
{
  sum=sum+arr[i];
  average=sum/arr.length;
}
  System.out.println("average value of array elements :"+ average);
}
}

