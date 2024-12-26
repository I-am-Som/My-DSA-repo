class Node {
    String value;
    Node next;

    Node(String value) {
        this.value = value;
        this.next = null;
    }

    Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void add(String value) {
        if (head == null) {
        head = new Node(value);
        tail = head;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}

public class LL {
        
   public static void main(String[] args) {

        LinkedList som = new LinkedList();
        som.add("holla");
        som.add("you");
        som.add("have");
        som.add("a");
        som.add("big");
        som.add("heart!!!");

        som.print();
    }
}