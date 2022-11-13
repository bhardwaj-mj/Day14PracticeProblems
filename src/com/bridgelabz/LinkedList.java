package com.bridgelabz;

public class LinkedList<T> {
    MyNode<T> head;
    MyNode<T> tail;
    public void push(T data){
        MyNode<T> newMyNode = new MyNode(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            newMyNode.setNext(head);
            head = newMyNode;

        }
    }
    public void append(T data){
        MyNode<T> newMyNode = new MyNode(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            tail.setNext(newMyNode);
            tail = newMyNode;

        }
    }
    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            MyNode<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getKey() + " ");
                temp = (MyNode<T>) temp.getNext();
            }
            System.out.println();
        }

    }

}
