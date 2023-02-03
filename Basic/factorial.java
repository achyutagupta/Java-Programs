import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int k = fact(n);
        System.out.println("The factorial of "+n+" is: "+k); 
        sc.close();
    }
    public static int fact(int n) {
        int x=1;
        for(int i=1 ; i<=n;i++){
            x= x*i;
        }
        return x;
    }
}
