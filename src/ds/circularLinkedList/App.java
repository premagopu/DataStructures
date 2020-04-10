package ds.circularLinkedList;

public class App {
    public static void main(String[] args) {
      CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(9);
        list.display();
    }
}
