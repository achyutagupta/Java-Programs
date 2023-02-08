import java.util.Scanner;
public class bubble_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("The sorted Array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
