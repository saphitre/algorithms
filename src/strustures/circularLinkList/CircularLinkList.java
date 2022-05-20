package strustures.circularLinkList;

public class CircularLinkList {
    private Link begin;
    private Link end;


     public CircularLinkList(){
        begin=null;
        end=null;
    }

    public boolean isEmpty(){
        return (begin==null);
    }

    public void insert(int data,String sData){
        Link link =new Link(data,sData);
        if(begin==null)
            begin=link;
        else
            end.next=link;
        end=link;
        end.next=begin;
    }

    public void delete(){ //удалить из начала списка
            begin=begin.next;
            end.next=begin;
    }
    public void display(){
        Link current = begin;
        do {
            current.display();
            current=current.next;
        }while (current!=begin);
    }
    public Link findByKey(int key){
         Link current = begin;
        if(current==null)
            return null;
        else
            do {
                current=current.next;
            } while(current.getData()!=key && current!=begin);
            if(current.getData()==key)
                System.out.println(current.getData());
        return current;
    }

    public void sort(){

    }

//    public Link deleteByKey(int key){
//        Link current = begin;
//        Link previous =begin;
//        if(current==null)
//            return null;
//        else
//            do {
//                previous=current;
//                current=current.next;
//            } while(current.getData()!=key && current!=begin);
//        if (current==begin){
//            begin=begin.next;
//        }
//        else{
//            previous.next=current.next;
//        }
//
//        return current;
//    }
}
