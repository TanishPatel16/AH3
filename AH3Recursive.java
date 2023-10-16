import java.util.*;

public class AH3Recursive {
    public static void FizzBuzz(int i, int n){
        if(i>n)
            return;
        
        if(i%15==0){
            System.out.print("FizzBuzz ");
            FizzBuzz(i+1, n);
            return;
        }

        if(i%3==0) {
            System.out.print("Fizz ");
            FizzBuzz(i+1, n);
            return;
        }

        if(i%5==0) {
            System.out.print("Buzz ");
            FizzBuzz(i+1, n);
            return;
        }

        System.out.print(i+" ");
        FizzBuzz(i+1, n);
        return;
    }
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = console.nextInt();
        FizzBuzz(1, n);
    }
}
