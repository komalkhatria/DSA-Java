import java.util.Scanner;
public class ReverseNumber {
    static void reverseNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reverseNum(n/10);

    }
    static int reverseNumber(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int ans= reverseNumber(n/10);
        int rev= ans*10 + n%10;
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Reversing the number... ");

        reverseNum(n);      //void method
        reverseNumber(n);       //return type method
    }
}
