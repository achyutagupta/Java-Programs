public class p10 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=5-i+1;k<=5;k++){
                if(k==6-i||k==5||i==5){
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
