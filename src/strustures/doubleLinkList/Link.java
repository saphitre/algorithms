package strustures.doubleLinkList;

public class Link { //элемент списка
    public int data;//ключевое поле
    private String sData; //прочие поля (просто так, не несут функционала)
    public Link next; //ссылка на след элемент
    public Link previous; //ссылка на предыдущий

    public int getData(){
        return data;
    } //получить ключ

    public void display(){
        System.out.println(data + " " + sData);
    } //вывести данные элемента списка

    public Link(int data, String sData){ //конструктор
        this.sData=sData;
        this.data=data;
    }
}
