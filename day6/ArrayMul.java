import java.util.*;
class ArrayMul{
public static void main(String []args){
int[][]arr1=new int[3][3];
int[][]arr2=new int[3][3];
Scanner sc=new Scanner (System.in);
//Scanner sc=new Scanner (System.in);
int i,j,a,b,mul=0;
System.out.println("Enter your array:");
for(i=0;i<3;i=i+1)
{
for(j=0;j<3;j=j+1)
{
for(a=0;a<3;a=a+1)
{
for(b=0;b<3;b=b+1)
{
arr1[i][j]=sc.nextInt();
arr2[a][b]=sc.nextInt();
mul=arr1[i][j]+arr2[a][b];
}
}
}
}
System.out.println("your array:");
for(i=0;i<3;i=i+1)
{
for(j=0;j<3;j=j+1)
{
for(a=0;a<3;a=a+1)
{
for(b=0;b<3;b=b+1)
{
System.out.print(" "+arr1[i][j]);
System.out.println(" "+arr2[a][b]);
System.out.println();
} 
}//System.out.println("multiplication of matrix is: "+mul);


}
}
}
}
