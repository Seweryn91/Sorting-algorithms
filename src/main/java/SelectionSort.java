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
