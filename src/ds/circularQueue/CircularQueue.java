package ds.circularQueue;

public class CircularQueue {
    private int size;
    private long[] queueArray;
    private int rear;
    private int front;
    private int elements;

    CircularQueue(int size){
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
            if(rear==size-1){
                rear=-1;
            }
            rear++;
            queueArray[rear] = num;
            elements++;

    }

    public long remove(){

            long num =queueArray[front];
            front++;

            if(front==size){
                front=0;
            }
            elements --;
            return num;

    }


    public void view(){
        for (int i =0 ;i<queueArray.length;i++){
            System.out.println(queueArray[i]);
        }
    }
}
