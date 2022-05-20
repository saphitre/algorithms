package strustures.doubleLinkList;

public class Link {
    private int data;
    private String sData;
    public Link next;
    public Link previous;

    public int getData(){
        return data;
    }

    public void display(){
        System.out.println(data + " " + sData);
    }

    public Link(int data, String sData){
        this.sData=sData;
        this.data=data;
    }
}
