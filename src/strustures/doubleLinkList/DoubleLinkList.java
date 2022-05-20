package strustures.doubleLinkList;

public class DoubleLinkList {
    private Link first;
    private Link last;

    public DoubleLinkList(){
        first=null;
    }

    public void insertFirst(int data, String sData){ //добавление в начало списка
        Link link = new Link(data,sData);
        link.next=first.next;
        first.next.previous=link;
        first.next=link;
        System.out.println(link.getData());
    }

    public void insertLast(int data, String sData){ //добавление в конец списка
        Link link = new Link(data, sData);
        last.next=link;
        link.previous = last;
        last=link;
        System.out.println(last.getData());
    }

    public void deleteFirst(){
        Link temp;
        first.next.next.previous=null;
        temp=first.next.next;
        first.next.next=null;
        first.next=temp;

    }

    public void deleteLast(){
        Link temp = last.previous;
        last.previous=null;
        last=temp;
        last.next=null;
    }


    public void deleteByKey(){

    }

    public void findByKey(int key){
        Link current = last;
        while (current.getData()!=key || current!=null){
            current=current.previous;
        }
        current.display();
    }

    public void sort(){}
}
