import java.util.ArrayList;
import java.util.List;

public class HeapSpace {

    private static List<byte[]> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            while (true) {
                memoryLeakList.add(new byte[1024 * 1024]); // 模拟持续向列表添加大量数据，导致内存泄漏
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: Java heap space");
            e.printStackTrace();
        }
    }
}
