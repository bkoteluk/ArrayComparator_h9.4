package pl.homework.lib;

public class ArrayComparator {

    public static boolean compare(int[] array1, int[] array2) {
        int i = 0;
        boolean arrayEqual = true;
        if (checkArrays(array1, array2)) {
            for(int number : array1) {
                if (number != array2[i]) {
                    arrayEqual =false;
                }
                i++;
            }
        } else {
            arrayEqual = false;
        }
        return arrayEqual;
    }

    public static boolean compare(int[][] array1, int[][] array2) {
        int i = 0;
        boolean arrayEqual = true;
        if (checkArrays(array1, array2)) {
            for (int[] array : array1) {
                if (!compare(array,array2[i])) {
                    arrayEqual = false;
                }
                i++;
            }
        } else {
            arrayEqual = false;
        }
        return arrayEqual;
    }

    public static boolean checkArrays(int[] array1, int[] array2) {
        return !isAnyNull(array1, array2) && !isAnyZero(array1,array2) && isLengthEq(array1, array2);
    }

    public static boolean checkArrays(int[][] array1, int[][] array2) {
        return !isAnyNull(array1, array2) && !isAnyZero(array1,array2) && isLengthEq(array1, array2);
    }

    private static boolean isAnyNull(int[] array1, int[] array2) {
        return array1 == null || array2 == null;
    }
    private static boolean isAnyNull(int[][] array1, int[][] array2) {
        return array1 == null || array2 == null;
    }

    private static boolean isAnyZero(int[] array1, int[] array2) {
        return array1.length == 0 || array2.length == 0;
    }

    private static boolean isAnyZero(int[][] array1, int[][] array2) {
        return array1.length == 0 || array2.length == 0;
    }
    private static boolean isLengthEq(int[] array1, int[] array2) {
        return array1.length == array2.length;
    }

    private static boolean isLengthEq(int[][] array1, int[][] array2) {
        return array1.length == array2.length;
    }

}
