import java.util.*;
public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1;
        }

        int fact= n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.print("Factorial of " + n + " is: ");
        System.out.println(factorial(n));
    }
}
