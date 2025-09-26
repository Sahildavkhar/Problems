// Implement a Queue using array
// Time Complexity: O(1) for push, pop, peek, and size operations
// Space Complexity: O(n) where n is the maximum size of the queue

class Queue {
    int arr[];
    int start, end, currSize, maxSize;

    public Queue(int size){
        arr = new int[16];
        start = -1;
        end =  -1;
        currSize = 0;
    }

    public Queue(){
        this.maxSize = 16;
        arr = new int[maxSize];
        start = -1;
        end =  -1;
        currSize = 0;
    }

    public void push(int x){
        if(currSize == maxSize){
            System.out.print("Queue Overflow");
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % maxSize;
        }
    }

    public void pop(){
        if(currSize == 0){
            System.out.print("Queue Underflow");
        }
        if(start == end){
            start = -1;
            end = -1;
        }
        else{
            start = (start + 1) % maxSize;
        }
    }

    public int peek(){
        if(currSize == 0){
            System.out.print("Queue is empty");
            return -1;
        }
        else{
            return arr[start];
        }
    }

    public int size(){
        return currSize;
    }
}

public class ImplementQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        q.pop();
        System.out.println("Front element is: " + q.peek());
    }
}
