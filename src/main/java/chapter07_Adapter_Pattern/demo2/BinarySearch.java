package chapter07_Adapter_Pattern.demo2;

/**
 * @ClassName BinarySearch
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:49
 * @Version 1.0
 */
public class BinarySearch {

    public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1; //找到元素返回1
            }
        }
        return -1;  //未找到元素返回-1
    }
}
