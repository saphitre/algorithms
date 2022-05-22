package strustures.twoDArray;

import sorting.SelectSort;
import sorting.ShakeSort;
import sorting.ShellSort;

import java.util.Scanner;

public class TwoDArray {
    private int nRow; //число строк
    private int mColumn; //число столбцов
    private Integer[][] array; //объявление массива
    private Integer[] arrayOneD; //объявление массива

    public void task(){ // задание
        fillTwoDArray(); //заполнить массив рандомными числами
        display(); // вывод массива
        convertToOneDArray(); //конвертировать двумерный массив в одномерный

        //вызовы методов сортировок классов ШеллаСорт, ВыборомСорт, ШейкернаяСорт (папка сортинг)
//        ShellSort.sort(arrayOneD);

//        SelectSort.sort(arrayOneD);

//        ShakeSort.sort(arrayOneD);


        System.out.println(); //пустая строка
//        convertToTwoDArray();
//        display();

//        searchRowMin();
//        searchRowMax();

//        searchColumnMin();
//        searchColumnMax();



    }
//поиска максимально и минимального в строке
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
//поиска максимального и минимального в столбце
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

    //конструктор
    public TwoDArray(int nRow, int mColumn){
        this.mColumn=mColumn; //определение полей класса входными параметрами
        this.nRow=nRow;
        array=new Integer[nRow][mColumn]; //выделение памяти под массив
        arrayOneD=new Integer[nRow*mColumn]; //выделение памяти под массив
    }

    private void fillTwoDArray(){ //заполнить массив рандомными числами
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                array[i][j]=(int) (Math.random()*100);
            }
        }
    }

    private void insert(){ // ввод элементов массива из консоли
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                array[i][j]=sc.nextInt();
            }
        }

    }

    public void display(){ //вывод двумерного массива
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void displayOneD(){ // не надо
        for (int i = 0;i<nRow*mColumn;i++){
            System.out.print(arrayOneD[i] + " ");
        }
    }

    private  void convertToOneDArray(){ // конвертировать из двумерного в одномерный
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                arrayOneD[i*mColumn+j]=array[i][j];
            }
        }
    }
    private  void convertToTwoDArray(){ // конвертировать из одномерного в двумерный
        for (int i = 0;i<nRow;i++){
            for(int j=0; j<mColumn;j++){
                array[i][j]=arrayOneD[i*mColumn+j];
            }
        }
    }


}
