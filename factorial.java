import java.util.Scanner;
public class factorial {
    public static int fact(int n ){
        if (n==0)
          return 1;
        return n*fact(n-1);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter any no. to gets its factorial");
        int n = sc.nextInt(); 
        sc.close();
        int ans = fact(n);
        System.out.println("factorial of input no. is: "+ans);
    }
}
