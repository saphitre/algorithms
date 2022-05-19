package sorting;

public class BubbleSort {
    public static void sort(Integer[] array){
        for (int i=array.length-1;i>1;i--){
            for (int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    private static void swap(Integer[] array, int i, int j){
        Integer temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
