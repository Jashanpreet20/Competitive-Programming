import java.util.*;

class make{
    public static int convert(int n){

        int binary=0;
        int i=0;

        while(true){
            if(n==0)
            {
                break;
            }else{
                int digit=n % 2;
                binary += digit* (int)Math.pow(10, i++);
                n = n /2;
            }
        }
        return binary;
        // fast bitwise operator
        // int binary=0;
        // int i=0;
        //  while ( n != 0){
        //     int digit=n & 1;
        //     binary += digit *(int) Math.pow(10, i++);
        //      n >>=1;
        //  }
        //  return binary;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 

        int result=convert(n);

        System.out.print(result);


    }
}