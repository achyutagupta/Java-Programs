import java.util.Scanner;
public class factorial_r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int k = factr(n);
        System.out.println("The factorial of "+n+" is: "+k); 
        sc.close();
    }
    public static int factr(int n) {
        if(n==1){
            return 1;
        }        
        else{
            return n*factr(--n);
        }
    }
}
