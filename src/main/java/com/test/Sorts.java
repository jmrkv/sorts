package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 24.06.17.
 */
public class Sorts {
            // мои сортировочки ^^
    public List<Integer> mergeSort(List<Integer> unsorted) {
        if (unsorted.size() > 1) {
            List<Integer> sortedLeft = new ArrayList<>(mergeSort(unsorted.subList(0, unsorted.size() / 2)));
            List<Integer> sortedRight = new ArrayList<>(mergeSort(unsorted.subList(unsorted.size() / 2, unsorted.size())));

            List<Integer> result = new ArrayList<>();

            while (sortedLeft.size() > 0 && sortedRight.size() > 0) {
                result.add(sortedLeft.get(0) > sortedRight.get(0) ? sortedRight.remove(0) : sortedLeft.remove(0));
            }
            result.addAll(sortedLeft);
            result.addAll(sortedRight);
            return result;
        }
        return unsorted;
    }
}
