package com.welkinbai.algorithm.sort;

import org.junit.Test;

import static com.welkinbai.utils.PrintHelper.finalPrint;
import static com.welkinbai.utils.PrintHelper.print;

/**
 * Created by Welkin Bai on 2016/8/16 0016.
 * codingAllInAll
 * English:Insertion Sorting algorithm is very simple sorting algorithm.The time complexity is O(N²)
 * 中文：插入排序算法是非常简单的排序算法，时间复杂度是O(N²)
 */
public class InsertionSorting implements SortAlgorithm {

    private final Integer[] normalCase = new Integer[]{34, 8, 64, 51, 32, 21};

    /**
     * 中文：插入排序算法由N-1趟排序组成。对于第p趟(1<=p<=N)排序，0到p-1位置上的元素为已经排序的状态
     * 每趟排序，位置p上的元素与其之前的元素逐个比较，如果小于元素m，则将元素m向右移动一位
     * 如果大于，则将p插入到元素m之后的位置，然后进行下一趟排序，最终，位置p上的元素将找到
     * 自己合适的位置插入，而比它大的元素都已经逐个向右移动，并顶替了p的位置。
     * @timeComplexity O(N*N)
     * @param arrayUnsorted the array unsorted
     * @throws Exception
     */
    private void sort(Integer[] arrayUnsorted) throws Exception {
        print(arrayUnsorted);
        int j;
        for (int p = 1; p < arrayUnsorted.length; p++) {
            int temp = arrayUnsorted[p];
            for (j = p; j > 0 && temp < arrayUnsorted[j - 1]; j--) {
                arrayUnsorted[j] = arrayUnsorted[j - 1];
            }
            arrayUnsorted[j] = temp;
            print(arrayUnsorted, p);
        }
        finalPrint(normalCase);
    }

    @Test
    public void main() throws Exception {
        sort(normalCase);
    }
}
