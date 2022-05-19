package sorting;

public class QuickSort {

    public static void sort(Integer[] array,Integer right,Integer left){
        if (right-left<=0);
        else {
            Integer partition = Partition.partition(array,array[right],left,right);
            sort(array,partition-1,left);
            for (int i=0; i<array.length;i++){
                System.out.println(array[i]);

            }
            System.out.println(" ");
//            sort(array,right,partition+1);
        }

    }


}
