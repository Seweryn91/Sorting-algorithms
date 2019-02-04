import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void testSort() {
        int[] testArray = createArray();
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        SelectionSort ss = new SelectionSort();
        ss.sort(testArray);
        String testArrayString = ss.arrayToString(testArray);
        String sortedArrayString = ss.arrayToString(sortedArray);
        assertEquals(sortedArrayString, testArrayString);
    }

    @Test
    void testToString_emptyArray() {
        int[] testArray = {};
        SelectionSort ss = new SelectionSort();
        String expected = "[]";
        String actual = ss.arrayToString(testArray);
        assertEquals(actual, expected);
    }

    int[] createArray() {
        int[] array = {8,7,5,3,6,1,2,0,4,9};
        return array;
    }

}