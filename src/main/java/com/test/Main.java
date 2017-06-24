package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] data = {40, 20, 10, 50, 30, 15, 7, 80, 12, 72};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        System.out.println(Arrays.toString(data));
    }

    private static List<Integer> getRightPart(List<Integer> list) {
        int k = list.size() % 2;
        return list.subList(k, list.size());
    }

    private static List<Integer> getLeftPart(List<Integer> list) {
        int k = list.size() % 2;
        return list.subList(0, k);
    }


    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = tmp;
    }

}

