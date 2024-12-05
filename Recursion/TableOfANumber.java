import java.util.*;
public class TableOfANumber
{
    static void printTable(int n, int times){
        if(times==0){
            return;
        }

        printTable(n, times-1);
        System.out.print(n*times + " ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Print table of: ");
        int n= sc.nextInt();
        System.out.print("Enter no. of multiples: ");
        int times= sc.nextInt();
        printTable(n, times);

    }
}