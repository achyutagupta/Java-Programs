public class fibonacci_r {
    public static void main(String args[]){
        System.out.print("0 1 ");
        int a=0 , b=1,  i=10;
        fibn(a , b , i);
    }
    static void fibn(int a,int  b , int i){
        if(i>0){
            int c = a+b;
            System.out.print(c+" ");
            a= b;
            b= c;
            i--;
            fibn(a , b ,i);
        }
    }
}
