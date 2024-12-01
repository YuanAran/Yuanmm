import java.util.HashMap;
import java.util.Map;

public class Backpack2 {
    public static float Greedy(int[] values, int[] weights, int capacity){
        float[] unitValue = new float[values.length];
        float sum=0;
        float n=0;
        Map<Float, Integer> map = new HashMap<>();
        for(int i=0;i<values.length;i++){
            unitValue[i] = (float) values[i] /weights[i];
            map.put(unitValue[i],i);
        }
        MergeSort.mergeSort(unitValue,0,unitValue.length-1);
        int index;
        for(int i=weights.length-1;i>=0&&capacity!=0;i--){
            index=map.get(unitValue[i]);
            if(weights[index]<capacity){
                n=weights[index];
                capacity-=weights[index];
                weights[index]=0;
            }else{
                n=capacity;
                weights[index]-=capacity;
            }
            sum+=n*unitValue[i];
        }
        return sum;
        }

    public static void main(String[] args) {
        int[] weights = {11, 1, 21,23,43,33,55,45};
        int[] values = {21, 11, 31,33,53,43,65,55};
        int W = 110;
        System.out.println(Greedy(values, weights, W));
    }
}
