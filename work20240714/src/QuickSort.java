public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,e;
        if(low>high) {
            return;
        }
        i=low;
        j=high;
        temp=arr[low];
        while(i<j){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                e=arr[j];
                arr[j]=arr[i];
                arr[i]=e;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);

    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,8,4,2,1,6,7,9,10};
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
