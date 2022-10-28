package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void push(T data){
        Node<T> node=new Node<>(data);
        if(head==null) {
            head = node;
            tail = node;
        }
        else{
            node.setNext(head);
            head=node;
        }
    }
    public void append(T data){
        Node<T> node=new Node<>(data);
        if(head==null) {
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail=node;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node<T> temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+" -> ");
            temp=temp.getNext();
        }
        System.out.println();
    }
}
