package ds.stack;

public class Stack {

    private int top;
    private int[] stackArray;
    private int size;

    Stack(int size){
        this.size=size;
        this.stackArray = new int[size];
        this.top=-1;
    }

    public Boolean isEmpty(){
        return top==-1;
    }

    public Boolean isFull(){
        return top == size-1;
    }

    public void push(int num){
        if(!isFull()){
            top++;
            stackArray[top]=num;
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int num = stackArray[top];
            top --;
            return num;
        }else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

}
