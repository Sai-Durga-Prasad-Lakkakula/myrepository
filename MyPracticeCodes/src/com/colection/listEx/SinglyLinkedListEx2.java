//insert a new node at the middle of the singly linked list

package com.colection.listEx;

public class SinglyLinkedListEx2 {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        //Checks if the list is empty  
        if(head == null) {
            //If list is empty, both head and tail will point to new node  
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;
            //newNode will become new tail of the list  
            tail = newNode;
        }
        size++;
    }

    //This function will add the new node at the middle of the list.  
    public void addInMid(int data){

        Node newNode = new Node(data);

        if(head == null) {
            //If list is empty, both head and tail would point to new node  
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp, current;
            //Store the mid position of the list  
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            temp = head;
            current = null;

            //Traverse through the list till the middle of the list is reached  
            for(int i = 0; i < count; i++) {
                //Node current will point to temp  
                current = temp;
                //Node temp will point to node next to it.  
                temp = temp.next;
            }

            //current will point to new node  
            current.next = newNode;
            //new node will point to temp  
            newNode.next = temp;
        }
        size++;
    }

    //display() will display all the nodes present in the list  
    public void display() {
        //Node current will point to head  
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static  void main(String[] args) {

        SinglyLinkedListEx2 sList = new SinglyLinkedListEx2();

        //Adds data to the list  
        sList.addNode(1);
        sList.addNode(2);

        System.out.println("Original list: ");
        sList.display();

        sList.addInMid(3);
        System.out.println( "Updated List: ");
        sList.display();

        sList.addInMid(4);
        System.out.println("Updated List: ");
        sList.display();
    }
}
