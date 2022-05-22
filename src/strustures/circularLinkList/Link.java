package strustures.circularLinkList;

public class Link { //элемент односвязного кольцевого списка
    private int data; //ключ
    private String sData;
    public Link next; //ссылка на след. элемент списка

    public int getData(){
        return data;
    } //получить ключ

    public Link(int data, String stringData){ //конструктор
        this.data=data;
        this.sData=stringData;
        // next по умолчанию присваивается null
    }

    public void display(){ //вывод элемента списка
        System.out.println(data + " " + sData);
    } //вывод  полей объекта в консоль
}
