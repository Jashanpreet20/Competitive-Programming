import java.util.*;

class make{
    public static void divide(int[] arr, int start, int end){
        int mid=start+(end-start)/2;

        int leftLength=mid-start+1;
        int rightLength=end-mid;

        int leftArray[]=new int[leftLength];
        int rightArray[]=new int[rightLength];

        int k=start;

        for(int i=0; i<leftLength; i++){
            leftArray[i]=arr[k++];
        }

        k=mid+1;

        for(int i=0; i<rightLength; i++){
            rightArray[i]=arr[k++];
        }

        int i=0; 
        int j=0;
        k=start;

        while(i < leftLength && j < rightLength){
            if(leftArray[i] <= rightArray[j]){
                arr[k++]=leftArray[i++];
            }else{
                arr[k++]=rightArray[j++];
            }
        }

        while(i < leftLength){
            arr[k++]=leftArray[i++];
        }
        while(j < rightLength){
            arr[k++]=rightArray[j++];
        }
    }
    public static void merge(int[] arr, int start, int end){
        if(start >= end || start == end){
            return;
        }

        int mid=start +(end-start)/2;

        // left array calculate krna
        merge(arr, start, mid);
        // right array calculate krna
        merge(arr, mid+1, end);

        divide(arr, start, end);
    }
    public static void main(String args[]){
        int[] arr={1,4,2,3,8,6,12,10,13,12,18,171,15,191,20};

        merge(arr, 0, arr.length -1);
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}