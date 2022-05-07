import java.util.*;
class ArrayAdd{
public static void main(String []args){
int[][]arr=new int[3][3];
Scanner sc=new Scanner (System.in);
int i,j,sum=0;
System.out.println("Enter your array:");
for(i=0;i<3;i=i+1)
{
for(j=0;j<3;j=j+1)
{
arr[i][j]=sc.nextInt();
sum=arr[i][j]+sum;
//System.out.println("addition of matrix is: "+sum);

}
}
System.out.println("your array:");
for(i=0;i<3;i=i+1)
{
for(j=0;j<3;j=j+1)
{
System.out.print(" "+arr[i][j]);

}
System.out.println();
} System.out.println("addition of matrix is: "+sum);

}
}
import java.util.*;

public class ArrayAdd {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        System.out.println("Enter first matrix : ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr1[i][j] = ob.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr2[i][j] = ob.nextInt();
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Addition of given matrix is : ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }
    }
}
