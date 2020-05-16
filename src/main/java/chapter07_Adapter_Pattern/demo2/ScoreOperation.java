package chapter07_Adapter_Pattern.demo2;

/**
 * @ClassName ScoreOperation
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:47
 * @Version 1.0
 */
public interface ScoreOperation {

    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}
