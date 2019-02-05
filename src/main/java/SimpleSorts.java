public class SimpleSorts {
/**Class includes some simple sorting algorithms with time complexity of O(N^2) */

    void insertionSort(int[] array) {
        int len = array.length;

        for (int i=1; i < len; ++i) {
            int key = array[i]; //set initial value of key to array[1]
            int j = i-1;

            while (j >= 0 && array[j] > key) { // move elements from beginning to len-1, that are > key to one pos ahead
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }


    void bubbleSort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len - i -1; j++)
                if (array[j] > array[j+1]) { // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    public void selectionSort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len-1; i++) {
            int min_index = i;

            for (int j = i+1; j < len; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    public String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i=0; i < array.length-1; ++i)
            sb.append(array[i]+", ");

        if (array.length > 0)
            sb.append(array[array.length-1]);

        sb.append(']');
        return sb.toString();
    }

}
