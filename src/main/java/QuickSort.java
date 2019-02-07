public class QuickSort {

    public void sort(int[] array){
        if (array.length < 2)
            throw new IllegalArgumentException("Array is too small!");

        int start = 0;
        int end = array.length-1;
        quickSort(array, start, end);
    }

    private void quickSort(int[] array, int start, int end) {
         if (start < end) {
            int indexOfPartition = partition(array, start, end);
            quickSort(array, start, indexOfPartition-1); //recursively call quickSort
            quickSort(array, indexOfPartition+1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end]; //set last element as pivot

        int i = start-1;

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i]; //swap
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;

        return i+1;
    }

}
