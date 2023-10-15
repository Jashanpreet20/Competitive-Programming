import java.util.*;

class make{
    public static void sub(String str,String output, int index){

        if(index >= str.length()){
            System.out.println("=> "+output);
            return;
        }
        
        //excluding
        sub(str, output, index+1);

        // including
        output += str.charAt(index);
        sub(str, output, index +1);

    }
    public static void main(String args[]){
        String str="abc";
        String output=new String();

        sub(str, output, 0);

        //System.out.print(str);
    }
}