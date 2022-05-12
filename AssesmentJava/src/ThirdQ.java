//Write a Program that take 5 numbers into array and print square value of each number.
public class ThirdQ {
    public static void main(String[]args){
        int[] arr={1,2,3,4,5};
        for(int num: arr){
            System.out.println( num );
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=(int) Math.pow(arr[i],2);
        }
        for (int num: arr){
            System.out.println(num);
        }
    }
}
