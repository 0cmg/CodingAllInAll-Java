package com.welkinbai.utils;

import java.util.Arrays;

/**
 * Created by Welkin Bai on 2016/8/23 0023.
 * codingAllInAll
 */
public class PrintHelper {

    public static <AnyType> void print(AnyType[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <AnyType> void print(AnyType[] array, int i) {
        System.out.println("After round " + i + "(第" + i + "次后):" + Arrays.toString(array));
    }

    public static <AnyType> void finalPrint(AnyType[] array) {
        System.out.println("result(结果)：" + Arrays.toString(array));
    }
}
