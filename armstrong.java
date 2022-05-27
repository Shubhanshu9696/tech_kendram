import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    static int count (int n){
        if(n/10==0){
            return 1;
        }
        return 1+count(n/10);
    }
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("entr any no. to check armstrong no.");
        int n = sc.nextInt();
        sc.close();
        int ans = count(n);

        double sum = 0;
        int input = n ; 
        while (n>0){
            int rem = n%10;
            sum =  sum + Math.pow(rem, ans);
            n = n/10;
        }

        if (sum==input) 
            System.out.println("armstrong number ");
        else System.out.println("not an armstrong no.");
         
    }
}
