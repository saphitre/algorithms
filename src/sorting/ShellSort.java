package sorting;

public class ShellSort {
    public static void sort (Integer[] array){
        int h = knuthSequence(1, array.length);
        while (h>0){
            hSort(array,h);
            h=(h-1)/3;
        }
    }

    public static void hSort(Integer[] array, int h){
        int j;
        Integer temp;
        for (int i=h;i < array.length;i++){
            j=i;
            temp=array[i];
            while (j>h-1 && array[j-h]>=temp){
                array[j]=array[j-h];
                j=j-h;
            }
            array[j]=temp;
        }
    }

    public static int knuthSequence(int h, int length){
        int temp=1;
        while (h<=length){
            temp=h;
            h=h*3+1;
        }
        return temp;
    }
}
