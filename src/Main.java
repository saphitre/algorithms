import sorting.*;
import strustures.circularLinkList.CircularLinkList;
import strustures.linkList.LinkList;

public class Main {
    public static void main(String[] args) {
        Integer[] array=new Integer[]{10,15,5,1,8,7,8,8,3,95,14,20,18,16,27};
//        BubbleSort.sort(array);
//        SelectSort.sort(array);
//        InsertSort.sort(array);
//        ShellSort.sort(array);
//        Partition.partition(array, 20, 0, array.length-1);
//        QuickSort.sort(array,array.length-1,0 );
//        display(array);

//        LinkList linkList = new LinkList();
//        System.out.println(linkList.isEmpty());
//        linkList.insert();
//        linkList.insert();
//        System.out.println(linkList.isEmpty());
//        linkList.display();
//        System.out.println(linkList.findByKey(1));
//        System.out.println(linkList.deleteByKey(1));
//        System.out.println(linkList.delete());


        CircularLinkList circularLinkList = new CircularLinkList();
        System.out.println(circularLinkList.isEmpty());
        circularLinkList.insert();
        System.out.println(circularLinkList.isEmpty());
        System.out.println(circularLinkList.findByKey(1));


    }

    private static void display(Integer[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}