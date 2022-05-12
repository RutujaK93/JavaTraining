/*Print all Armstrong numbers between 100 to 999 using while loop.
        Note :- An Armstrong number of three digits is an integer
        such that the sum of the cubes of its digits is equal to the number itself
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        int i = 100, arm;
        System.out.println("Print all Armstrong number between 100 to 999");
        while (i < 1000) {
            arm = armstrongOrNot(i);
            if (arm == i) {
                System.out.println(i);
                i++;
            }
        }
        static int armtrongnum ( int num){
            int x,a = 0;
            while (num != 0) {
                x = num % 10;
                a = a + (x * x * x);
                num /= 10;
            }

            return a;
        }
    }
}*/
