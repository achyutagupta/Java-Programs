// Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
import java.util.Scanner;
public class fascinating {
    public static void main(String[] args) {
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        int n2=n1*2;
        int n3=n1*3;
        String s1=Integer.toString(n1);
        String s2=Integer.toString(n2);
        String s3=Integer.toString(n3);
        String s=s1+s2+s3;
        for(char i='0';i<='9';i++){
            // char ch1 = (char) i;
            // System.out.println(i);
            for(int j=0;j<s.length();j++){
                char ch=(s.charAt(j));
                // System.out.println(ch);
                if(ch==i){
                    k++;
                }
            }
        }
        if(k==9){
            System.out.println(n1+" is a fascinating number");
        }
        else{
            System.out.println(n1+" is not a fascinating number");
        }
        sc.close();
    }
}
