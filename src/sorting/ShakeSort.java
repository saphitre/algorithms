package sorting;

public class ShakeSort
{
    public static void sort(Integer[] array){
        int right=array.length-1,left=0;
        boolean flag=true;
        while(right>left && flag){
            flag=false;
            for(int i=left;i<right;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                    flag=true;
                }
            }

            for(int i=right;i>left;i--){
                if(array[i]<array[i-1]){
                    swap(array,i,i-1);;
                    flag=true;
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
