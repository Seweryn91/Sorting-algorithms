public class SelectionSort {

    public void sort(int[] array) {
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

}
