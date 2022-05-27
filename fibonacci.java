import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1 ; 
        System.out.print(a+", "+b);
        int next = a+b;

        for(int i=2; i<n ; i++){
            System.out.print(", "+next);
            a = b;
            b = next; 
            next = a+b; 
        }

    }
}