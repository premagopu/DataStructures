package ds.circularLinkedList;

public class CircularLinkedList {

    private Node first;
    private Node last;

    CircularLinkedList(){
        first =null;
        last=null;
    }

    public Boolean isEmpty(){
        return first==null;
    }


    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }

        newNode.next = first;
        first = newNode;

    }


    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }else {
            last.next =newNode;
            last=newNode;
        }
    }

    public int deleteFirst(){
        int temp = first.data;

        if(first.next==null){
            first=null;
        }

        first=first.next;
        return  temp;


    }

    public void display(){
        Node current = first;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

}
