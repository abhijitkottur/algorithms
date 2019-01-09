package com.abhijit.linkedlist;

class Node<T> {
    private T t;
    private Node<T> next;

    public Node(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}

public class SinglyLinkedList<T> {
    private Node<T> head;

    private int size;

    public void addToFront(T t) {
        Node<T> node = new Node<>(t);
        node.setNext(head);
        head = node;
        size++;
    }

    public T removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node<T> removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode.getT();
    }

    public void print() {
        Node<T> current = head;
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
