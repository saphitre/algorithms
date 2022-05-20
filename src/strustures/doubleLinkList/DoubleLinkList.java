package strustures.doubleLinkList;

public class DoubleLinkList {
    private Link first;
    private Link last;

    public DoubleLinkList(){
        first=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data, String sData){ //добавление в начало списка
        Link link = new Link(data,sData);
        if(first==null){
            last=link;
        }
        else {
            first.previous=link;
            link.next=first;
        }
        first=link;
        System.out.println(link.getData());
    }

    public void insertLast(int data, String sData){ //добавление в конец списка
        Link link = new Link(data, sData);
        if (first==null){
            first=link;
        }
        else {
            last.next = link;
            link.previous = last;
        }
        last=link;
        System.out.println(last.getData());
    }

    public void deleteFirst(){
        if(first.next==null){
            last=null;
        }
        else {
            first.next.previous=null;
        }
        first=first.next;
    }

    public void deleteLast(){
        Link temp;
        if (first.next==null){
            first=null;
        }
        else {
            last.previous.next=null;
        }
        last=last.previous;
    }


    public void deleteByKey(){

    }

    public void sort(){}
}
