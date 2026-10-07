package dsa.linkedlist;

public class PrintEveryElement {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = null;

        Node head = first;

        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
