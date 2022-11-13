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
    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public T pop() {
        if (head == null)
            return null;
        else {
            T data = head.getKey();
            head = (MyNode<T>) head.getNext();
            return data;
        }
    }
    public T popLast() {
        if (head == null)
            return null;
        else {
            MyNode<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (MyNode<T>) temp.getNext();
            }
            T data = tail.getKey();
            temp.setNext(null);
            tail = temp;
            return data;
        }
    }
    public MyNode<T> search(T searchData) {
        MyNode<T> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(searchData))
                return temp;
            temp = (MyNode<T>) temp.getNext();
        }
        return null;
    }
    public boolean searchAndInsert(T searchData, T insertData) {
        MyNode<T> newMyNode = new MyNode(insertData);
        MyNode<T> searchedMyNode = search(searchData);
        if (searchedMyNode == null)
            return false;
        else {
            newMyNode.setNext(searchedMyNode.getNext());
            searchedMyNode.setNext(newMyNode);
            return true;
        }

    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
