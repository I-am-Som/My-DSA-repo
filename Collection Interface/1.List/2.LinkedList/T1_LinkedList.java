class Node {

    int data;
    Node next;

    Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class T_2_LinkedList {

    public static void main(String[] args) {
        int[] myArray = {1,3,6,4,9};
        Node xyz = new Node(myArray[0]);
        System.out.println(xyz.data);
    }
}