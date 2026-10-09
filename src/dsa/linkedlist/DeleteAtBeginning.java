package dsa.linkedlist;

public class DeleteAtBeginning {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("Linked List is Empty, No data");
            return;
        }
        System.out.println("Delete first Element fron Linked List "+head.data);
        head = head.next;

    }


    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked List is Empty!");
            return;
        }

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DeleteAtBeginning list = new DeleteAtBeginning();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        System.out.println();
        System.out.println("Delete the first element!");
        list.deletefirst();

        list.display();

    }
}
