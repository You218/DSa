package myclient.LinkedList;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
       void insertAtLast(int val){
           Node temp = new Node(val);
           if(head == null){
               head = temp;
           }else{
               tail.next = temp;
           }
           tail = temp;
       }
       void insertAtBegin(int val){
           Node temp = new Node(val);
           if(head == null){
               head = temp;
               tail =  temp;
           }else{
               temp.next = head;
               head = temp;
           }
       }
       void insertAt(int index, int val){
           Node t = new Node(val);
           Node temp = head;
           if(index == size()) {
               insertAtLast(val);
               return;
           }else if(index == 0){
               insertAtBegin(val);
               return;
           }else if(index < 0 || index > size()){
               System.out.println("Wrong index");
           }
           for(int i=1; i<=index-1; i++){
               temp = temp.next;
           }
           t.next = temp.next;
           temp.next = t;
       }
       int getAt(int index){
           Node temp = head;
           for(int i=1; i<=index; i++){
               temp = temp.next;
           }
           return temp.data;
       }
       void deleteAt(int index){
           if(index == 0) head = head.next;
           Node temp = head;
           for(int i=0; i<index-1; i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           tail = temp;
       }
       void display(){
           Node temp = head;
           while (temp!=null){
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           System.out.println();
       }
       int size(){
           Node temp = head;
           int count = 0;
           while(temp!=null){
               count++;
               temp = temp.next;
           }
           return count;
       }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtBegin(60);
        ll.insertAtLast(4);
        ll.insertAtLast(24);
        ll.insertAt(3, 99);
        ll.display();
        ll.insertAtBegin(20);
        ll.insertAtLast(21);
        ll.display();
        ll.getAt(1);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.size());

    }
}
