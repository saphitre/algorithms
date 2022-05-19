package strustures.linkList;

public class LinkList {
    private Link first;

    public void LinkList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }

    public void insert(){ //добавить в начало списка
        Link link = new Link(1, "Hello");
        link.next=first;
        first = link;
    }
    public Link delete(){ //удалить из начала списка
        first=first.next;
        return first;
    }
    public void display(){
        Link current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
    }
    public Link findByKey(int key){
        Link current = first;
        while(current.getData()!=key){
            if(current==null)
                return null;
            else
            current=current.next;
        }
        return current;
    }
    public Link deleteByKey(int key){
        Link current = first;
        Link previous =first;
        while(current.getData()!=key){
            if(current==null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current==first)
            first=first.next;
        else
            current=current.next;
        return current;
    }
}
