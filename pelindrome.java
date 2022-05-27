import java.util.Scanner;
public class pelindrome {
    public static void main (String[] args){
        int sum=0; 
        Scanner sc = new Scanner( System.in);
        System.out.println("enter any no. to check pelindrome ");
        int n = sc.nextInt();
        sc.close();
        int input = n;

        while (n>0) {
            int rem = n%10;
            sum = (sum*10)+rem;
            n=n/10;
        }
        if (input == sum)
          System.out.println("pelindrom number");
        else
        System.out.println("not a pelindrom number");

    }
}
