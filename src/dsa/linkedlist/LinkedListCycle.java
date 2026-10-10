package dsa.linkedlist;

public class LinkedListCycle {
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


    public void createCycle(int position){
        if(head == null){
            return;
        }

        Node temp = head;
        Node target = null;
        int index = 0;

//        find the node at  the given position

        while (temp.next != null){
            if(index == position){
                target = temp;
            }
            temp = temp.next;
            index++;
        }

//        handle the last node position too

        if(index == position){
            target = temp;
        }

//        Connect last node to the target node
        if(target != null){
            temp.next = target;
        }
    }


    public boolean Cycle(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return false;
        }

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
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
        LinkedListCycle list = new LinkedListCycle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.createCycle(2);

        System.out.println(list.Cycle());
//        list.display();
    }
}
