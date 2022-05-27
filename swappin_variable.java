import java.util.Scanner;
public class swappin_variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number a:");
        int a = sc.nextInt();
        System.out.println("enter second number b:");
        int b = sc.nextInt(); 
        sc.close();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swap a ="+a);
        System.out.println("after swap b ="+b);
    }
}
