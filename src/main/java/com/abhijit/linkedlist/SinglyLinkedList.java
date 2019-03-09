package com.abhijit.linkedlist;

class SinglyNode<T> {
    private T t;
    private SinglyNode<T> next;

    public SinglyNode(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public SinglyNode<T> getNext() {
        return next;
    }
    public void setNext(SinglyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}

public class SinglyLinkedList<T> {
    private SinglyNode<T> head;

    private int size;

    public void addToFront(T t) {
    	SinglyNode<T> node = new SinglyNode<>(t);
        node.setNext(head);
        head = node;
        size++;
    }

    public T removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        SinglyNode<T> removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode.getT();
    }

    public void print() {
    	SinglyNode<T> current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getT());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
