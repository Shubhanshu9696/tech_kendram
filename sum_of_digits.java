import java.util.Scanner;
public class sum_of_digits {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0; 
        while (n>0) {
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        System.out.println("sum of the digit is: "+sum);
    }
}
