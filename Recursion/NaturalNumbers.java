import java.util.*;
public class NaturalNumbers {
    static void printNums(int n){
        if(n==0){
            return;
        }
        printNums(n-1);     //
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        printNums(n);
    }
}
