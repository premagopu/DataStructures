package ds.singlyLinkedList;

public class SinglyLinkedList {

    private Node first;

    public  Boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode =new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first=first.next;
        return temp;
    }

    public void display(){
        Node current = first;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

  /*  public void insertLast(int data){
        Node newNode =new Node();
        newNode.data=data;
        Node current = first;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public Node deleteLast(){
        Node current =first;
        while (current.next!=null){
            current = current.next;
        }
        current.next = null;
        return current;
    }*/



}
