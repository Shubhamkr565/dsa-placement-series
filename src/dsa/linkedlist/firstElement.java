package dsa.linkedlist;

public class firstElement {

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
        Node four = new Node(40);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = null;

        Node temp = first;
        if(temp == first){
            System.out.println("First Element present in the Node: "+temp.data);
        }else{
            temp = temp.next;
        }
    }
}
