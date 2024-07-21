package myclient.LinkedList;

public class printLL {

    static void recDisplay(Node head){
        if(head == null) return;
        System.out.println(head.data);
        recDisplay(head.next);
    }

    static void reverse(Node head){
        if(head == null) return;
        reverse(head.next);
        System.out.println(head.data);
    }

    static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head =  head.next;
        }
    }

    static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        Node temp = a;
//        for(int i=1; i<=4; i++){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        display(a);
//        recDisplay(a);
        reverse(a);
        System.out.println(length(a));
    }
}

