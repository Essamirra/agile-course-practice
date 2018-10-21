package ru.unn.agile.QuickSort.Model;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void canSortOfArrayWithOneInteger() {
        Integer[] actualArray = {1};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void canSortOfSortedArrayWithTwoIntegers() {
        Integer[] actualArray = {1, 2};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void canSortOfNonSortedArrayWithTwoIntegers() {
        Integer[] actualArray = {2, 1};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void canSortOfNonSortedArrayWithThreeIntegers() {
        Integer[] actualArray = {2, 0, 1};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void canSortOfSortedArrayWithThreeIntegers() {
        Integer[] actualArray = {0, 1, 2};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void canSortOfNonSortedBigArrayOfIntegers() {
        Integer[] actualArray = {1, 4, 3, -1, 5, 8, 8, -100, 9, 4, 1, 0};
        Integer[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsWhenSortOfEmptyArrayOfIntegers() {
        Integer[] array = {};

        QuickSort.sort(array);
    }

    @Test
    public void canSortOfNonSortedBigArrayOfDoubles() {
        Double[] actualArray = {1.4, 4.3, 3.3, -1.9, 5.1, 8.5, 8.0, -100.0, 9.7, 4.1, 1.6, 0.0};
        Double[] expectedArray = actualArray.clone();
        Arrays.sort(expectedArray);

        QuickSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}
