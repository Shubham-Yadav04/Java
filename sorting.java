import java.util.Arrays;

public class sorting {
    public static int[] bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1;j++){
                int temp=0;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int maxIndex=0;
            int temp=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>=arr[maxIndex]){
                    maxIndex=j;
                }

            }
            temp=arr[maxIndex];
            arr[maxIndex]=arr[arr.length-i-1];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static int[] insertionSort(int arr[]){

        for(int turn=0;turn<arr.length;turn++){
            int previous=turn-1;
            int current=arr[turn];
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;

        }
        return arr;
    }

    public static int[] merge(int arr[],int start,int end){
        int leftIdx=start;
        int mid=start+(end-start)/2;
        int rightIdx=mid+1;
        int merger[]=new int[start+end+1];
        int mergerIdx=0;
        while(leftIdx<=mid && rightIdx<=end){
            if(arr[leftIdx]<arr[rightIdx]){
                merger[mergerIdx++]=arr[leftIdx++];
            }
            else{
                merger[mergerIdx++]=arr[rightIdx++];
            }
        }
        while(leftIdx<=mid){
            merger[mergerIdx++]=arr[leftIdx++];
        }
        while(rightIdx<=end){
            merger[mergerIdx++]=arr[rightIdx++];
        }
        int j=start;
        for(int i=0;j<=end;i++,j++){
            arr[j]=merger[i];
        }
        return arr;
}
    public static int[] mergeSortDivide(int arr[],int start,int end){
        if(start>=end){
            return arr;
        }
        int mid=start+(end-start)/2;
        mergeSortDivide(arr, start, mid);
        mergeSortDivide(arr,mid+1,end);
// now we have to conquer the above divide array to sort them one by one
        return merge(arr,start,end);

    }

//    quick Sort
    public static void quickSort(int arr[],int start,int end){

        int pivot=arr[end];
        if(start>=end){
            return;
        }
        int referalIdx=0;
        for(int j=0;j<arr.length;j++){
         if(arr[j]<pivot){
             int temp=arr[j];
             arr[j]=arr[referalIdx];
             arr[referalIdx]=temp;
             referalIdx++;
         }
        }
        int temp=arr[referalIdx];
        arr[referalIdx]=pivot;
        arr[end]=temp;
        quickSort(arr,start,referalIdx-1);
    quickSort(arr,referalIdx+1,end);


    }
    public static void main(String []args){
        int arr[]={2,34,5,6,3,45};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
