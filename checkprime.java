import java.util.Scanner;
public class checkprime {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter a number to check prime ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 2 ; i<=n/2 ; i++){
            if(n%i==0){
                System.out.println("not a prime number");
            }
        }
        System.out.println("prime number");

    }
}
