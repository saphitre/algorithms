package strustures.circularLinkList;

public class CircularLinkList { //односвязный кольцевой список
    private Link begin;  //ссылка на 1ый элемент списка
    private Link end;  //ссылка на последний элемент списка


     public CircularLinkList(){ //конструктор без аргументом
        begin=null;
        end=null;
    }

    public boolean isEmpty(){
        return (begin==null);
    } //проверка на наличие элементов в списке

    public void insert(int data,String sData){ //вставка элемента в конец списка
        Link link =new Link(data,sData);
        if(begin==null) //если список пуст
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

    public void display(){ //вывести список
        Link current = begin;
        do {
            current.display();
            current=current.next;
        }while (current!=begin);
    }

    public Link findByKey(int key){ //найти элемент по ключу
         Link current = begin;
        if(current==null) //если список пуст
            return null;
        else
            do {
                current=current.next;
            } while(current.getData()!=key && current!=begin);
            if(current.getData()==key)
                System.out.println(current.getData());
        return current;
    }

    public void sort() {
        for (Link startNode = begin; startNode != end; startNode = startNode.next) {
            for (Link startNodeL = begin; startNodeL != end; startNodeL = startNodeL.next) {
                if (startNodeL.getData() > startNodeL.next.getData()) {
                    Link tmp = startNodeL.next;
                    startNodeL.next = startNodeL;
                    startNodeL = tmp;
                }
            }
        }
        System.out.println("sorted");
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
