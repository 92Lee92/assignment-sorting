public class StringInsertionSort {
    public static String[] sort(String[] data){
        String[] clone = data.clone();

        for (int i = 1; i < clone.length; i++) {
            String key = clone[i];
            int j = i-1;
            while(j>=0&&clone[j].compareToIgnoreCase(key)>0){
                clone[j+1]= clone[j];
                j--;
            }
            clone[j+1]=key;
        }

        return clone;
    }
}
