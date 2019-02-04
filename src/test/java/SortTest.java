import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void testSelectionSort() {
        int[] testArray = createArray();
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        Sort sort = new Sort();
        sort.selectionSort(testArray);
        String testArrayString = sort.arrayToString(testArray);
        String sortedArrayString = sort.arrayToString(sortedArray);
        assertEquals(sortedArrayString, testArrayString);
    }

    @Test
    void testBubbleSort() {
        int[] testArray = createArray();
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        Sort sort = new Sort();
        sort.bubbleSort(testArray);
        String testArrayString = sort.arrayToString(testArray);
        String sortedArrayString = sort.arrayToString(sortedArray);
        assertEquals(sortedArrayString, testArrayString);
    }

    @Test
    void testInsertionSort() {
        int[] testArray = createArray();
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        Sort sort = new Sort();
        sort.insertionSort(testArray);
        String testArrayString = sort.arrayToString(testArray);
        String sortedArrayString = sort.arrayToString(sortedArray);
        assertEquals(sortedArrayString, testArrayString);
    }

    @Test
    void testToString_emptyArray() {
        int[] testArray = {};
        Sort sort = new Sort();
        String expected = "[]";
        String actual = sort.arrayToString(testArray);
        assertEquals(actual, expected);
    }

    int[] createArray() {
        int[] array = {8,7,5,3,6,1,2,0,4,9};
        return array;
    }

}