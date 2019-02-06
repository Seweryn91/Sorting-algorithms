public class MergeSort {
    private int[] arrayToSort;
    private int[] helperArray;

    private int len;

    public void sort(int[] inputArray) {
        this.arrayToSort = inputArray;
        len = inputArray.length;
        this.helperArray = new int[len];
        mergesort(0, len - 1);
    }

    private void mergesort(int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2; //get element in the middle
            mergesort(start, mid); //sort left side of array
            mergesort(mid + 1, end); //sort right side of array
            merge(start, mid, end); //merge array
        }
    }

    private void merge(int start, int mid, int end) {

        // Copy both parts into the helperArray array
        for (int i = start; i <= end; i++) {
            helperArray[i] = arrayToSort[i];
        }

        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (helperArray[i] <= helperArray[j]) { //get lowest values from array
                arrayToSort[k] = helperArray[i]; //and put those on input array
                i++;
            } else {
                arrayToSort[k] = helperArray[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            arrayToSort[k] = helperArray[i]; //copy rest of left side to the target array
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}