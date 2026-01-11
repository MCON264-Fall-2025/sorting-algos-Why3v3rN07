package edu.touro.mcon264.sorting;

import java.util.Comparator;

public class MergeSort implements Sorter {
    private Object[] numbers;
    private Comparator comp;

    @Override
    public <T> void sort(T[] a, Comparator<? super T> comp) {
        this.numbers = a;
        this.comp = comp;
        mergeSort(0, a.length-1);
    }

    private void mergeSort(int first, int last) {
        if (first < last) {
            int mid = (first+last)/2;
            mergeSort(first, mid);
            mergeSort(mid+1, last);
            merge(first, mid, mid+1, last);
        }
    }

    private void merge(int lFirst, int lLast, int rFirst, int rLast) {
        Object[] temp = new Object[numbers.length];
        int index = lFirst;
        int f = lFirst;
        while (lLast-lFirst >= 0 && rLast-rFirst >= 0) {
            if (comp.compare(numbers[lFirst], numbers[rFirst]) <= 0) {
                temp[index] = numbers[lFirst];
                lFirst++;
            } else {
                temp[index] = numbers[rFirst];
                rFirst++;
            }
            index++;
        }
        while (lLast-lFirst >= 0) {
            temp[index] = numbers[lFirst];
            lFirst++;
            index++;
        }
        while (rLast-rFirst >= 0) {
            temp[index] = numbers[rFirst];
            rFirst++;
            index++;
        }
        for (int i = f; i <= rLast; i++) {
            numbers[i] = temp[i];
        }
    }
}
