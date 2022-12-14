package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.show();
        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.show();
        linkedList1.pop();
        linkedList1.show();
        linkedList2.pop();
        linkedList2.show();
        linkedList1.popLast();
        linkedList1.show();
        linkedList2.popLast();
        linkedList2.show();
        System.out.println( linkedList1.search(30));
        linkedList1.searchAndInsert(30,40);
        linkedList1.show();
        linkedList1.deleteValue(40);
        linkedList1.show();
    }
}
