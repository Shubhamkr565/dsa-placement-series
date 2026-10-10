package dsa.linkedlist;

public class ReverseLinkedList {

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

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;


    }


    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.insert(10);
        list.insert(20);
//        list.insert(30);
//        list.insert(40);
//        list.insert(50);

        list.display();

        System.out.println("Reverse Linked List");
        list.reverse();
        list.display();

    }
}
