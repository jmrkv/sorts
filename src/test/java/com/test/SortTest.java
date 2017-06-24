package com.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SortTest {

    Sorts sut = new Sorts();

    @Test
    public void sort_1_items() throws Exception {
        List<Integer> actual = sut.mergeSort(asList(1));
        assertEquals(asList(1), actual);
    }

    @Test
    public void sort_2_items() throws Exception {
        List<Integer> actual = sut.mergeSort(asList(2, 1));
        assertEquals(asList(1, 2), actual);
    }

    @Test
    public void sort_3_items() throws Exception {
        List<Integer> actual = sut.mergeSort(asList(3, 2, 1));
        assertEquals(asList(1, 2, 3), actual);
    }
    @Test
    public void sort_10_items() throws Exception {
        List<Integer> actual = sut.mergeSort(asList(3, 2, 1, 54, 12, 78, 5, 19, 90, 10));
        assertEquals(asList(1, 2, 3, 5, 10, 12, 19, 54, 78, 90), actual);
    }
}