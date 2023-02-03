import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        checkisprime(n);
        sc.close();
    }
    public static void checkisprime(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                k++;
            }
        }
        if(k==2)
            System.out.println(n+" is a Prime Number.");
        else
        System.out.println(n+" is not a Prime Number.");
    }
}
