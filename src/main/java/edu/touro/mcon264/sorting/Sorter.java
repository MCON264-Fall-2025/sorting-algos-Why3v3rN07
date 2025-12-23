package edu.touro.mcon264.sorting;

import java.util.Comparator;

public interface Sorter {
    <T> void sort(T[] a, Comparator<? super T> comp);
}
