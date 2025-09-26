// Implement stack using array
// Time Complexity: O(1) for push, pop, peek, and size operations
// Space Complexity: O(n) where n is the maximum size of the stack

class stack{
    int size = 1000;
    int [] arr = new int[size];
    int top = -1;

    void push(int x){
        if(top == size - 1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top] = x;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int x = arr[top];
            top--;
            return x;
        }
    }

    int peek(){
        if(top == -1){
            System.out.print("Stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }

    int size(){
        return top + 1;
    }
}

public class ImplementStack {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element is: " + st.peek());
        System.out.println("Stack size is: " + st.size());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Top element is: " + st.peek());
    }
}