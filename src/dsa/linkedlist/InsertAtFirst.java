package dsa.linkedlist;

import java.util.LinkedList;

public class InsertAtFirst {

    static public class LinkedListInsertion{
        static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head;

//        insert at first
        void insertAtFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            } else{
                newNode.next = head;
                head = newNode;
            }
        }

//        display
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }




    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);


        list.display();
    }
}
