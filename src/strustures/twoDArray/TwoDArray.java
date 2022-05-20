package strustures.twoDArray;

import sorting.SelectSort;
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

        SelectSort.sort(arrayOneD);


        System.out.println();
        convertToTwoDArray();
        display();
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
                System.out.println(array[i][j]);
            }
        }
    }

    public void displayOneD(){
        for (int i = 0;i<nRow*mColumn;i++){
            System.out.println(arrayOneD[i]);
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
