package edu.touro.mcon264.sorting;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    private static final Comparator<Integer> INT_COMP = Comparator.naturalOrder();

    @Test
    void sortsRandomArray() {
        Integer[] a = {7, 2, 9, 1, 5, 3};
        new MergeSort().sort(a, INT_COMP);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 7, 9}, a);
    }

    @Test
    void handlesAlreadySortedArray() {
        Integer[] a = {1, 2, 3, 4, 5};
        new MergeSort().sort(a, INT_COMP);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void handlesReverseSortedArray() {
        Integer[] a = {5, 4, 3, 2, 1};
        new MergeSort().sort(a, INT_COMP);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void handlesDuplicateValues() {
        Integer[] a = {3, 1, 2, 3, 1};
        new MergeSort().sort(a, INT_COMP);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3}, a);
    }

    @Test
    void handlesEdgeCases() {
        Integer[] empty = {};
        new MergeSort().sort(empty, INT_COMP);
        assertArrayEquals(new Integer[]{}, empty);

        Integer[] single = {42};
        new MergeSort().sort(single, INT_COMP);
        assertArrayEquals(new Integer[]{42}, single);
    }
}
