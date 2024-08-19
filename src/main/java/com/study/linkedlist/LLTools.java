package com.study.linkedlist;

public class LLTools {
    public int getSize(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int getElementAtKthNode(int k, Node head) {
        Node temp = head;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        if(temp != null) {
            return temp.data;
        } else {
            return -1;
        }
    }

    public Node insertElement(Node head, int data) {
        Node newNode = new Node(data, null);

        //Case 1. Head is pointing to null, There are no elements in Linked list
        if(head == null) {
            return newNode;
        }

        //Case 2. If the given element is less than the head data
        if(head.data >= data) {
            newNode.next = head;
            return newNode;
        }

        //Case 3. Insert the given element in the middle of Linked list. ( Also handles adding the node at end of linked list)
        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }
        newNode.next=temp.next;
        temp.next = newNode;
        return head;
    }

    public void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
