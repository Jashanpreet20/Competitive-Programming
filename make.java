import java.util.*;

class make{
    
    public static int close(int[] arr, int x){
        int start=0;
        int end=arr.length-1;

        int ans=-1;
        while(start <= end){
            int mid=start +(end-start)/2;

            if(arr[mid] >= x) {
                ans=mid;
                end=mid-1;
            }
            else if(x > arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
   
    public static void main(String args[]){
        int[] arr={1,1,1,10,10,10};
       
        int x=9;
        int result=close(arr, x);
        System.out.print("at index="+result);
    }
}