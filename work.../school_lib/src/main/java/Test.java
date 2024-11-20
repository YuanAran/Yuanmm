public class Test {
    public static void main(String[] args) {
        int[] a={32,56,12,68,55,49,14};
        MergeSort.mergeSort(a,0,a.length-1);
        for (int i:a){
            System.out.println(i);
        }
    }
}
