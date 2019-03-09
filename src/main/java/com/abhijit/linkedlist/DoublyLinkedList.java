package com.abhijit.linkedlist;

class DoublyNode<T> {
    private T t;
    private DoublyNode<T> next;
    private DoublyNode<T> previous;

    public DoublyNode(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public DoublyNode<T> getNext() {
        return next;
    }
    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }
    public DoublyNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DoublyNode<T> previous) {
		this.previous = previous;
	}

	@Override
    public String toString() {
        return t.toString();
    }
}

public class DoublyLinkedList<T> {
	private DoublyNode<T> head;
	private DoublyNode<T> tail;
	private int size;
	
	public void addToFront(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		if (isEmpty()) {
			head = tail = node;
		} else {
			node.setNext(head);
			head.setPrevious(node);
			head = node;
		}
		size++;
	}
	
	public T removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		DoublyNode<T> node = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head.getNext().setPrevious(null);

			head = head.getNext();
		}
		size--;
		node.setNext(null);
		return node.getT();
	}
	
	public void addToBack(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		if (isEmpty()) {
			head = tail = node;
		} else {
			node.setPrevious(tail);
			tail.setNext(node);
			tail = node;
		}
		size++;
	}
	
	public T removeFromBack() {
		if (isEmpty()) {
			return null;
		}
		DoublyNode<T> node = head;
		if (head == tail) {
			head = tail = null;
		} else {
			tail.getPrevious().setNext(null);

			tail = tail.getNext();
		}
		size--;
		node.setPrevious(null);
		return node.getT();
	}
	
	public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }
    
    public void print() {
    	DoublyNode<T> current = head;
        System.out.print("Head <-> ");
        if (current != null) {
        	do {
                System.out.print(current.getT());
                System.out.print(" <-> ");
                current = current.getNext();
            } while (current != null);
        }
        System.out.println("Tail");
    }
	
}
