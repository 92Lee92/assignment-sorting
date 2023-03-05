import java.util.Arrays;

public class Main {
    public static void selectionTestPrint(String[] testData){
        System.out.println("정렬하기 전 : "+Arrays.toString(testData));
        System.out.println("선택정렬 결과 : "+Arrays.toString(StringSelectionSort.sort(testData)));
    }
    public static void bubbleTestPrint(String[] testData){
        System.out.println("정렬하기 전 : "+Arrays.toString(testData));
        System.out.println("버블정렬 결과 : "+Arrays.toString(StringBubbleSort.sort(testData)));
    }

    public static void insertionTestPrint(String[] testData){
        System.out.println("정렬하기 전 : "+Arrays.toString(testData));
        System.out.println("삽입정렬 결과 : "+Arrays.toString(StringBubbleSort.sort(testData)));
    }
    public static void main(String[] args) {

//        selectionTestPrint(new String[]{"Variable","Array","Iteration","Class","Thread"});
//        bubbleTestPrint(new String[]{"Variable","Array","Iteration","Class","Thread"});
        insertionTestPrint(new String[]{"Variable","Throw","Array","Iteration","Class","Thread"});
    }

}
