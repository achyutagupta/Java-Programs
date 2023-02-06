// A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number. For example, 2025 is a tech number.
import java.util.Scanner;
public class tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        checktech(n);
        sc.close();
    }
    public static void checktech(int n) {
        int k= calculatedigits(n);
        if(k%2==0){
        int d1= (int)(n/Math.pow(10,k/2));
        int d2= (int)(n%Math.pow(10,k/2));  
        // System.out.println(n1+" "+n2); 
        int  d= d1+d2;
        if (n==d*d){
            System.out.println(n+" is a Tech Number.");
        }   
        else{
            System.out.println(n+" is not a Tech Number.");
        }
    }
    else{
        System.out.println(n+" is not a Tech Number.");
    }
    }
    public static int calculatedigits(int n) {
        int k=0;
        while(n!=0){
            k++;
            n=n/10;
        }
        return k;
    }
}
