package strustures.doubleLinkList;

public class DoubleLinkList { //двусвязный список
    private Link first; //ссылка на первый элемент
    private Link last; //ссылка на последний элемент

    public DoubleLinkList(){ //конструктор
        first=null;
    }

    public boolean isEmpty(){
        return (first==null);
    } //проверка есть ли элементы в списке

    public void insertFirst(int data, String sData){ //добавление в начало списка
        Link link = new Link(data,sData); // создание объекта ( нового элемента списка)
        if(first==null){ //если список пуст
            last=link;
        }
        else {
            first.previous=link;
            link.next=first;
        }
        first=link;
        System.out.println(link.getData()); //вывод ключа нового элемента
    }

    public void insertLast(int data, String sData){ //добавление в конец списка
        Link link = new Link(data, sData); // создание объекта ( нового элемента списка)
        if (first==null){ //если список пуст
            first=link;
        }
        else {
            last.next = link;
            link.previous = last;
        }
        last=link;
        System.out.println(last.getData()); //вывод ключа нового элемента
    }

    public void deleteFirst(){ //удалить элемент из начала списка
        if(first.next==null){ //если список пуст
            last=null;
        }
        else {
            first.next.previous=null;
        }
        first=first.next;
    }

    public void deleteLast(){ //удалить элемент из конца списка
        if (first.next==null){ //если список пуст
            first=null;
        }
        else {
            last.previous.next=null;
        }
        last=last.previous;
    }

    public void display(){
        Link current=first;
        do{
            current.display();
            current=current.next;
        }
        while (current!=last);
    }

    public void sort() { //сортировка
        for (Link startNode = first; startNode != last; startNode = startNode.next) {
            for (Link startNodeL = first; startNodeL != last; startNodeL = startNodeL.next) {
                if (startNodeL.getData() > startNodeL.next.getData()) {
                    int tmp = startNodeL.next.data;
                    startNodeL.next.data = startNodeL.data;
                    startNodeL.data = tmp;
                }
            }
        }
    }
}
