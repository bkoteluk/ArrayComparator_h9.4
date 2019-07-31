package pl.homework.app;

import static pl.homework.lib.ArrayComparator.compare;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 3, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {0, 1, 3, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Tabele są równe ? " + compare(array1, array2));

        int[][] array21 = {{1, 2, 3}, {4, 5}, {7, 8, 9}, {0, 10, 11}};
        int[][] array22 = {{1, 2, 3}, {4, 5}, {7, 8, 9}, {0, 10, 11}};
        System.out.println("Tabele dwuwymiarowe są równe ? " + compare(array21, array22));
    }
}
