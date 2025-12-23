package edu.touro.mcon264.sorting.demos;

import edu.touro.mcon264.sorting.*;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        Integer[] data = {5, 2, 9, 1, 3};
        Sorter sorter = new InsertionSort();
        sorter.sort(data, Comparator.naturalOrder());
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
