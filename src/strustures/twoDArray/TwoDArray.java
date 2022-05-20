package strustures.twoDArray;

import sorting.SelectSort;
import sorting.ShakeSort;
import sorting.ShellSort;

public class TwoDArray {
    private int nRow;
    private int mColumn;
    private Integer[][] array;
    private Integer[] arrayOneD;

    public void task(){
        fillTwoDArray();
        display();
        convertToOneDArray();

//        ShellSort.sort(arrayOneD);

//        SelectSort.sort(arrayOneD);

//        ShakeSort.sort(arrayOneD);


        System.out.println();
//        convertToTwoDArray();
//        display();

//        searchRowMin();
//        searchRowMax();

//        searchColumnMin();
//        searchColumnMax();



    }

    private void searchRowMax(){
        int max;
        for (int i = 0;i<nRow;i++){
            max=array[i][0];
            for(int j=1; j<mColumn;j++){
                if(max<array[i][j])
                    max=array[i][j];
            }
            System.out.println(max);
        }
    }

    private void searchRowMin(){
        int min;
        for (int i = 0;i<nRow;i++){
            min=array[i][0];
            for(int j=1; j<mColumn;j++){
                if(min>array[i][j])
                    min=array[i][j];
            }
            System.out.println(min);
        }
    }

    private void searchColumnMax(){
        int max;
        for (int i = 0;i<mColumn;i++){
            max=array[0][i];
            for(int j=1; j<nRow;j++){
                if (max<array[j][i])
                    max=array[j][i];
            }
            System.out.println(max);
        }
    }

    private void searchColumnMin(){
        int min;
        for (int i = 0;i<mColumn;i++){
            min=array[0][i];
            for(int j=1; j<nRow;j++){
                if (min>array[j][i])
                    min=array[j][i];
            }
            System.out.println(min);
        }
    }

    public TwoDArray(int nRow, int mColumn){
        this.mColumn=mColumn;
        this.nRow=nRow;
        array=new Integer[nRow][mColumn];
        arrayOneD=new Integer[nRow*mColumn];
    }

    private void fillTwoDArray(){
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                array[i][j]=(int) (Math.random()*100);
            }
        }
    }

    public void display(){
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void displayOneD(){
        for (int i = 0;i<nRow*mColumn;i++){
            System.out.print(arrayOneD[i] + " ");
        }
    }

    private  void convertToOneDArray(){
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                arrayOneD[i*mColumn+j]=array[i][j];
            }
        }
    }
    private  void convertToTwoDArray(){
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                array[i][j]=arrayOneD[i*mColumn+j];
            }
        }
    }


}
