import sorting.*;
import strustures.circularLinkList.CircularLinkList;
import strustures.doubleLinkList.DoubleLinkList;
import strustures.linkList.LinkList;
import strustures.twoDArray.TwoDArray;

public class Main {
    public static void main(String[] args) {
        //не надо
//        Integer[] array=new Integer[]{10,15,5,1,8,7,8,8,3,95,14,20,18,16,27};
//        BubbleSort.sort(array);
//        SelectSort.sort(array);
//        InsertSort.sort(array);
//        ShellSort.sort(array);
//        ShakeSort.sort(array);
//        Partition.partition(array, 20, 0, array.length-1);
//        QuickSort.sort(array,array.length-1,0 );
//        display(array);

        //односвязный список
//        LinkList linkList = new LinkList();
//        System.out.println(linkList.isEmpty());
//        linkList.insert();
//        linkList.insert();
//        System.out.println(linkList.isEmpty());
//        linkList.display();
//        System.out.println(linkList.findByKey(1));
//        System.out.println(linkList.deleteByKey(1));
//        System.out.println(linkList.delete());


        //односвязный кольцевой список
//        CircularLinkList circularLinkList = new CircularLinkList();
//        System.out.println(circularLinkList.isEmpty());
//        circularLinkList.insert(1, "Hello");
//        circularLinkList.insert(3,"Bye");
//        circularLinkList.insert(2,"Good");
//        System.out.println(circularLinkList.isEmpty());
//        circularLinkList.sort();
//        circularLinkList.display();
//        System.out.println(circularLinkList.findByKey(3));
//        circularLinkList.delete();
//        System.out.println(circularLinkList.findByKey(1));

        //двусвязный список
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.insertFirst(1,"Hello");
        doubleLinkList.insertFirst(3,"Booo");
        doubleLinkList.insertLast(2,"Bye");
        doubleLinkList.sort();
        doubleLinkList.display();
        doubleLinkList.deleteLast();
        doubleLinkList.deleteFirst();
        System.out.println(doubleLinkList.isEmpty());

        //двумерный массивы
//        TwoDArray twoDArray=new TwoDArray(4,4);
//        twoDArray.task();


    }

    private static void display(Integer[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
