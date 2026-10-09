package dsa.linkedlist;

public class DeleteAtAnyLocation {

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

    public void deleteAtFirst(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }
        System.out.println("Delete First Element "+head.data);
        head = head.next;
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }

        if(head.next == null){
            System.out.println("Delete last Node "+head.data);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        System.out.println("Delete Last Element "+ temp.next.data);
        temp.next = null;
    }

    public void deleteAtAnyLoc(int position){
        if(position < 1){
            System.out.println("Invalid Input");
            return;
        }

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if(position == 1){
            deleteAtFirst();
            return;
        }

        Node temp = head;
        for(int i=1; i<position-1; i++){
            if(temp.next == null){
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Invalid Position");
            return;
        }



        System.out.println("Delete Element at position: "+position+" Value: "+temp.next.data);
        temp.next = temp.next.next;

    }

    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty!.");
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

        DeleteAtAnyLocation list = new DeleteAtAnyLocation();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        System.out.println();
        list.deleteAtAnyLoc(4);
        list.display();

    }
}
