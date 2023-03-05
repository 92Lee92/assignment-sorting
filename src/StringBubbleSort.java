public class StringBubbleSort {
    public static String[] sort(String[] data) {
        String[] sorted = data.clone();
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++)
                if (sorted[j].compareToIgnoreCase(sorted[j + 1]) > 0) {
                    String temp;
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
        }
        return sorted;
    }
}
