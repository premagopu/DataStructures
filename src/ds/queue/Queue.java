package ds.queue;

public class Queue {

    private int size;
    private long[] queueArray;
    private int rear;
    private int front;
    private int elements;

    Queue(int size){
        this.size=size;
        this.queueArray = new long[size];
        this.rear = -1;
        this.front = 0;
        this.elements = 0;
    }

    public Boolean isEmpty(){
        return elements==0;
    }

    public Boolean isFull(){
        return elements==size;
    }

    public void insert(long num){
        if(!isFull()){
            rear++;
            queueArray[rear] = num;
            elements++;
        }
        else {
            System.out.println("Queue is full");
        }
    }

    public long remove(){
        if(!isEmpty()){
            long num =queueArray[front];
            front++;
            elements --;
            return num;
        }else {
            return '0';
        }
    }

}
