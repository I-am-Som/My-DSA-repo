import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(45);
        myStack.push(985);
        myStack.push(989);
        myStack.push(4515);
        myStack.push(455656);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack);
     }
}