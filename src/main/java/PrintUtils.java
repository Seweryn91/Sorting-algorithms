public class PrintUtils {

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
