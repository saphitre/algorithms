package sorting;

public class Partition {
    public static int partition(Integer[] array, Integer pivot,Integer left, Integer right){
        Integer leftPart=left-1, rightPart=right+1;
        while (true) {
            while (leftPart < right && array[++leftPart] <= pivot) ;
            while (rightPart > left && array[--rightPart] >= pivot) ;
            if(leftPart>=rightPart)
                break;
            else
                swap(array,leftPart,rightPart);
        }
        return leftPart;
    }

    private static void swap(Integer[] array, int i, int j){
        Integer temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
