import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkpalindrome(n);
        sc.close();
    }
    public static void checkpalindrome(int n) {
        int k = n, x=0, p;
        while (n>0){
            p=n%10;
            x=x*10+p;
            n=n/10;
        }
        if(x==k){
            System.out.println(k+" is a palindrome number.");
        }
        else{
        System.out.println(k+" is not a palindrome number.");
        }
    }
}
