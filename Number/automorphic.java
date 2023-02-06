// A number is called an automorphic number if and only if the square of the given number ends with the same number itself.

import java.util.Scanner;
public class automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        checkautomorphic(n);
        sc.close();
    }
    public static void checkautomorphic(int n) {
        int k=calculatedigits(n);
        double sq=n*n;
        if ((sq%Math.pow(10,k))==n){
            System.out.println(n+" is an Automorphic Number");
        }
        else{
            System.out.println(n+" is not an Automorphic Number");
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