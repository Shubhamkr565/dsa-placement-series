package dsa.linkedlist;

public class MiddleOfTheLinkedList {

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

        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void findMiddle(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }

        Node fast = head;
        Node slow = head;


        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element: "+slow.data);


    }


    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return;
        }
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        MiddleOfTheLinkedList list = new MiddleOfTheLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        System.out.println();
        list.findMiddle();


    }

}
