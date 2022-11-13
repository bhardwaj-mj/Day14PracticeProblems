package com.bridgelabz;

public class MyNode<T> implements INode<T> {
    private T key;

    // K,V

    private MyNode<T> next;

    public MyNode(T key) {
        this.key = key;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public INode<T> getNext() {
        return (MyNode<T>)next;
    }

    @Override
    public void setNext(INode<T> next) {
        this.next = (MyNode<T>) next;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode: " + " Key= ").append(key);
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }
}

