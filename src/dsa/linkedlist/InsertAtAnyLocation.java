package dsa.linkedlist;

public class InsertAtAnyLocation {

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

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int data){
        Node newNode= new Node(data);
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

    public void InsertAtAnyLoc(int data, int position){
        Node newNode = new Node(data);

        if(position<1){
            System.out.println("Invalid Position:");
            return;
        }
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i=1; i<position-1; i++){
            if(temp == null){
                System.out.println("Invalid Position!");
                return;
            }
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid Position!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty: ");
            return;
        }

        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        InsertAtAnyLocation list = new InsertAtAnyLocation();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();
        System.out.println();

        System.out.println("insert At First: ");
        list.insertAtFirst(5);

        list.display();

        System.out.println();
        System.out.println("Insert At End");
        list.InsertAtEnd(100);

        list.display();
        System.out.println();
        list.InsertAtAnyLoc(99, 15);
        System.out.println("Insert At Any Position");
        list.display();

    }

}
