import java.util.Scanner;
public class linear_s
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n= sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements into an array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        int k=0;
        for(int i=0; i<n;i++){
            if(arr[i]==ele){
                k++;
            }
        }
        if(k!=0){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}