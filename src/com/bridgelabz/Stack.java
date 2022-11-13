package com.bridgelabz;

public class Stack<E> {

    LinkedList<E> linkedList = new LinkedList<>();
    public Stack() {
    }
    public Stack(LinkedList<E> linkedList) {
        this.linkedList = linkedList;
    }
    public void push(E data) {

        linkedList.push(data);
    }
    public void print() {
        linkedList.show();
    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        stack1.print();

    }
}
