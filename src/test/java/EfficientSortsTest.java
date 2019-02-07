import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EfficientSortsTest {

    private PrintUtils printUtils = new PrintUtils();
    private MergeSort mergeSort = new MergeSort();
    private QuickSort quickSort = new QuickSort();


    @Test
    void testMergeSort() {
        int[] arrayToSort = createArray();
        mergeSort.sort(arrayToSort);
        String actual = printUtils.arrayToString(arrayToSort);
        String expected = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
        assertEquals(expected, actual);
    }

    @Test
    void testQuickSort() {
        int[] arrayToSort = createArray();
        quickSort.sort(arrayToSort);
        String actual = printUtils.arrayToString(arrayToSort);
        String expected = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
        assertEquals(expected, actual);
    }

    @Test
    void testQuickSort_largeArray() {
        int[] arrayToSort = createLargeArray();
        quickSort.sort(arrayToSort);
        String actual = printUtils.arrayToString(arrayToSort);
        String expected = "[1, 2, 4, 4, 5, 5, 7, 9, 9, 10, 10, 10, 12, 12, 13, 14, 14, 17, 17, 23, 23, 24, 26, 29, 30, 30, 30, 30, 31, 31, 32, 36, 36, 37, 38, 39, 39, 39, 40, 43, 44, 46, 46, 47, 47, 48, 49, 50, 52, 52, 53, 53, 56, 56, 57, 58, 59, 60, 60, 61, 65, 69, 69, 69, 69, 70, 72, 72, 75, 75, 75, 75, 77, 77, 77, 78, 81, 82, 83, 83, 84, 84, 85, 85, 86, 86, 88, 88, 90, 90, 91, 91, 91, 92, 93, 94, 96, 96, 97, 99]";
        assertEquals(expected, actual);
    }

    @Test
    void testQuickSort_withMergeSort() {
        int[] arrayToSort1 = createLargeArray();
        int[] arrayToSort2 = createLargeArray();
        quickSort.sort(arrayToSort1);
        mergeSort.sort(arrayToSort2);
        String quickSortResult = printUtils.arrayToString(arrayToSort1);
        String mergeSortResult = printUtils.arrayToString(arrayToSort2);

        assertEquals(quickSortResult, mergeSortResult);
    }


    private int[] createArray() {
        return new int[]{8,7,5,3,6,1,2,0,4,9};
    }
    private int[] createLargeArray() { return new int[]{75,88,83,85,99,26,86,69,60,88,97,31,4,39,46,84,53,83,81,52,77,85,29,5,77,53,69,75,1,2,5,38,50,69,58,70,91,56,10,23,17,96,59,30,86,90,93,39,30,57,90,14,14,13,12,12,37,39,36,48,75,31,78,75,91,9,84,44,10,36,65,10,30,32,92,40,17,47,72,9,61,23,4,47,94,77,7,24,82,72,56,49,96,69,30,43,46,91,60,52}; }


}