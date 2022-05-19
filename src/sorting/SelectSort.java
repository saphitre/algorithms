package sorting;

public class SelectSort {
    public static void sort(Integer[] array){
        for(int i=0;i<array.length-1;i++){
            Integer min = i;
            for (int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            swap(array,i,min);
        }
    }

    private static void swap(Integer[] array, int i, int j){
        Integer temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
