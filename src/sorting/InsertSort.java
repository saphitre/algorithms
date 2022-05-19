package sorting;

public class InsertSort {
    public static void sort(Integer[] array){
        int j;
        Integer temp;
        for (int i=1;i < array.length;i++){
            j=i;
            temp=array[i];
            while (array[j-1]>=temp && j>1){
                array[j]=array[j-1];
                --j;
            }
            array[j]=temp;
        }
    }
}
