public class searching {
    public static void linearSearch(int arr[], int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("number found");
                return ;
            }
        }
        System.out.println("number not found");
    }
    public static void binarySearch(int arr[],int num){
        int start=0;
        int end=arr.length-1;

        while(end>start){
            int mid=start+(end-start)/2;
           if(arr[mid]==num){
               System.out.println("number is available in array");
               return ;
           }
           if(arr[mid]>num){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
        }
        System.out.println("number not found");
    }
    public static void main(String []args){
        int arr[]={2,4,5,6,78,98};
        int num=45;
        linearSearch(arr,num);
        binarySearch(arr,num);
    }
}
