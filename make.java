import java.util.*;

class make{
    public static void print(String str,String output,int index,char ch){
       if(index >= str.length()){
        System.out.print(output);
        return;
       }

       if(str.charAt(index) == ch){
            output= String.valueOf(index);
       }

       print(str, output, index+1,ch);
    }
    public static void main(String args[]){
        String str="abddbd";
        char ch='d';
        String output="";
        
        print(str, output, 0, ch);
    }
}