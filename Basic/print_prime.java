import java.util.Scanner;
public class print_prime {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (int i = n1; i<= n2;i++){
            if(checkprime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    static boolean checkprime(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                k++;
            }
        }
        if(k==2)
            return true;
        else
            return false;
    }
}
