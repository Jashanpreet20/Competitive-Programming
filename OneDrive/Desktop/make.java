import java.util.*;

class make{
    public static int convert(int n){   
        int decimal=0;
        int i=0;

        while(n !=0 ){
            int digit=n % 10;

            decimal += digit * (int) Math.pow(2, i++);
            n = n/10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 

        int result=convert(n);

        System.out.print(result);


    }
}