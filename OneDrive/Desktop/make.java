class make{

    public static void swap(int[] arr, int s, int e){
        int temp=arr[s];
        arr[s++]=arr[e];
        arr[e--]=temp;
    }
    public static void sort(int[] arr){
        int l=0; 
        int m=0;
        int h=arr.length -1;

        while(m <= h){
            if(arr[m] == 0){
                swap(arr, m,l);
                l++;
                m++;
            }

            else if(arr[m] == 1){
                m++;
            }else{
                swap(arr, m, h);
                h--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String agrs[]){
        int[] arr={1,0,2,1,0,0,2,1,1,0};

        sort(arr);

        
    }
}