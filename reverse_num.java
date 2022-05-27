import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any digit");
        int n = sc.nextInt(); 
        sc.close();
        int reverse = 0;
        while ( n>0) {
            int rem = n%10;
            reverse = (reverse*10) + rem;
            n = n/10;
        }
        System.out.println("digit after reversing is: "+reverse);
    }
}
