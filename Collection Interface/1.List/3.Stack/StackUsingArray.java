class Stack {
    int length;
    int top = -1;
    int[] stackArray;
    
    public Stack(int length) {
        this.length = length;
        stackArray = new int[length];
    }

    public void push(int element) {
        if (top < stackArray.length - 1) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack overflow---->stack is full!!");
        }
    }

    public void pop() {
        if(top > -1) {
            stackArray[top] = 0;
            top--;
        } else {
            System.out.println("Stack underflow---->stack is empty!!");
        }

    }

    public void display() {
        System.out.println("----");
        for(int i = stackArray.length - 1; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
        System.out.println("----");
    }
}

public class StackUsingArray {
    public static void main(String[] args) {

        Stack myStack = new Stack(5);
        myStack.push(45);
        myStack.push(985);
        myStack.push(34);
        myStack.push(21);
        myStack.push(77);

        myStack.display();
    }
}
