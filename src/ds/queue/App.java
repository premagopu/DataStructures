package ds.queue;

public class App {
    public static void main(String[] args) {
        Queue q =new Queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
