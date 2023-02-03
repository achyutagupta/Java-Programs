import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        checkarmstrong(a);
        sc.close();
    }
    public static void checkarmstrong(int n) {
        int k = calculatedigits(n);
        int n1= n,p;
        double x= 0;
        while(n>0){
            p=n%10;
            x=x + Math.pow(p,k);
            n=n/10;
        }
        if(x==n1){
            System.out.println(n1+" is a Armstrong Number");
        }
        else{
            System.out.println(n1+" is not a Armstrong Number");
        }
        
    }
    public static int calculatedigits(int n) {
        int k=0;
        while (n>0){
            k++;
            n=n/10;
        }
        return k;
    }
}
