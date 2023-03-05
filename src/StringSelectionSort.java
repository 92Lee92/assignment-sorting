public class StringSelectionSort {
    public static String[] sort(String[] data){
        String[] clone = data.clone();

        for (int i = 0; i <clone.length-1 ; i++) {
            int minIndex = i;
            for(int j = i+1 ;j <clone.length; j++){
                if(clone[minIndex].compareToIgnoreCase(clone[j])>0){
                    minIndex=j;
                }
            }
            String temp;
            temp = clone[minIndex];
            clone[minIndex] = clone[i];
            clone[i] = temp;
        }
        return clone;
    }
}
