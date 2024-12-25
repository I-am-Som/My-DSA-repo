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

public class T2_CoversionArrToLL {

    private static Node arrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;  

        for(int i = 0; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] myArray = {7,5,3,6,5};
        Node head = arrToLL(myArray);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
