package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    @Test
    public void testIsPrime() {
        assertTrue(Algorithms.isPrime(2));
        assertTrue(Algorithms.isPrime(3));
        assertFalse(Algorithms.isPrime(4));
        assertFalse(Algorithms.isPrime(1));
        assertFalse(Algorithms.isPrime(-5));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Algorithms.factorial(0));
        assertEquals(1, Algorithms.factorial(1));
        assertEquals(120, Algorithms.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.factorial(-1));
    }

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, Algorithms.binarySearch(arr, 3));
        assertEquals(-1, Algorithms.binarySearch(arr, 6));
        assertEquals(0, Algorithms.binarySearch(arr, 1));
    }

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 1, 4, 2, 8};
        Algorithms.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, arr);

        int[] alreadySorted = {1, 2, 3, 4, 5};
        Algorithms.bubbleSort(alreadySorted);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, alreadySorted);
    }
}
