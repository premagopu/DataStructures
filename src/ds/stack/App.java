package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack s =new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
