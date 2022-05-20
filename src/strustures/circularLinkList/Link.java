package strustures.circularLinkList;

public class Link {
    private int data;
    private String sData;
    public Link next;

    public int getData(){
        return data;
    }

    public Link(int data, String stringData){ //конструктор
        this.data=data;
        this.sData=stringData;
        // next по умолчанию присваивается null
    }

    public void display(){ //вывод элемента списка
        System.out.println(data + " " + sData);
    }
}
