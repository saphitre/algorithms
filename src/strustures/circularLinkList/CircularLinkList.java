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

    public void insert(){
        Link link =new Link(1,"Igor");
        if(begin==null)
            begin=link;
        else
            end.next=link;
    }

    public Link delete(){ //удалить из начала списка
            begin=begin.next;
            return begin;
    }
    public void display(){
        Link current = begin;
        while (current!=null){
            current.display();
            current=current.next;
        }
    }
    public Link findByKey(int key){
         Link current = begin;
        while(current.getData()!=key){
            if(current==null)
                return null;
            else
                current=current.next;
        }
        return current;
    }

    public Link deleteByKey(int key){
        Link current = begin;
        Link previous =begin;
        while(current.getData()!=key){
            if(current==null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current==begin)
            begin=begin.next;
        else
            current=current.next;
        return current;

    }
}
