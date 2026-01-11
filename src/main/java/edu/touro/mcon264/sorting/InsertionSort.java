package edu.touro.mcon264.sorting;

import java.util.Comparator;

public class InsertionSort implements Sorter {

    @Override
    public <T> void sort(T[] a, Comparator<? super T> comp) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (comp.compare(a[j], a[j-1]) < 0) {
                    T temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}
