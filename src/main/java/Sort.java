public class Sort {

    void bubbleSort(int arr[])
    {
        int len = arr.length;
        for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len - i -1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
