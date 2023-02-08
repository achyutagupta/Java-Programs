import java.util.Scanner;
public class selection_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n= sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements into an array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min,temp;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }   
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted Array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
