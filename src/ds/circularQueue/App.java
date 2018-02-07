package ds.circularQueue;

public class App {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(99);
        cq.insert(999);
       cq.view();
    }
}
