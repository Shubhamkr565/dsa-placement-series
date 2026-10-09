package dsa.linkedlist;

public class DeleteAtEnd {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        // Case 1: Only one node
        if (head.next == null) {
            System.out.println("Delete Last Node: " + head.data);
            head = null;
            return;
        }

        // Case 2: Multiple nodes
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Delete Last Node: " + temp.next.data);
        temp.next = null;
    }


    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty:");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DeleteAtEnd list = new DeleteAtEnd();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        System.out.println();
        list.deleteAtEnd();
        list.display();

    }
}
