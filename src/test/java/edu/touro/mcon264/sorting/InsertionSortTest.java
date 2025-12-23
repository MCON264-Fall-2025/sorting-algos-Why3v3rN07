package edu.touro.mcon264.sorting;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    void sortsArray() {
        Integer[] a = {4, 1, 3, 2};
        new InsertionSort().sort(a, Comparator.naturalOrder());
        assertArrayEquals(new Integer[]{1,2,3,4}, a);
    }
}
