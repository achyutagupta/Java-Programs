import java.util.Scanner;
public class binary_s {
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
        int d, l, k=0,mid=0;
        d=0;
        l=n-1;
        while(arr[mid]!=ele){
            mid=(d+l)/2;
            if(arr[mid]==ele){
                k++;
                break;
            }
            if(arr[mid]<ele){
                d=mid+1;
            }
            if(arr[mid]>ele){
                l=mid-1;
            }
            if(d==l){
                break;
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
