package strustures.linkList;

public class Link {
    private int data; //ключ
    private String stringData;
    public Link next; //ссылка на след. элемент списка

    public int getData(){
        return data;
    }

    Link(int data, String stringData){ //конструктор
        this.data=data;
        this.stringData=stringData;
        // next по умолчанию присваивается null
    }

    public void display(){ //вывод элемента списка
        System.out.println(data + " " + stringData);
    }
}
