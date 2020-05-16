package chapter07_Adapter_Pattern.demo2;

/**
 * @ClassName OperationAdapter
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:49
 * @Version 1.0
 */
public class OperationAdapter implements ScoreOperation {

    private final QuickSort sortObj; //定义适配者QuickSort对象
    private final BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array); //调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
