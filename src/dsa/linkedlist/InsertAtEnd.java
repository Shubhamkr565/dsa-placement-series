package dsa.linkedlist;

public class InsertAtEnd {

    public static class LinkedListInsertAtEnd{
        static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        void insertAtEnd(int data){
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


        void display(){
            if(head == null){
                System.out.println("Empty Linked List........");
                return;
            }

            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }


        }
    }


    public static void main(String[] args) {
        LinkedListInsertAtEnd list = new LinkedListInsertAtEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();
    }
}
