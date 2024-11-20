
public class MergeSort {

    public static int[] newArray(int[] a, int size, int start) {
        int[] arr = new int[size];
        System.arraycopy(a, start, arr, 0, size);
        return arr;
    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) >>1;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        int[] left = newArray(a, leftSize, low);
        int[] right = newArray(a, rightSize, mid + 1);

        int i = 0, k = 0, index = low;

        while (i < leftSize && k < rightSize) {
            if (left[i] <= right[k]) {
                a[index] = left[i];
                i++;
            } else {
                a[index] = right[k];
                k++;
            }
            index++;
        }

        while (i < leftSize) {
            a[index] = left[i];
            i++;
            index++;
        }

        while (k < rightSize) {
            a[index] = right[k];
            k++;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] a={32,56,12,68,55,49,14};
//        int[] b=new int[4];
//        System.arraycopy(a,3,b,0,4);
//        for(int i:b){
//            System.out.println(i);   输出 68，55，49，14
//        }
        mergeSort(a,0,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }
}
