package com.abhijit.linkedlist;

import com.abhijit.Employee;

public class LinkedListTest {

	static Employee janeJones = new Employee(1, "Jane", "Jones");
	static Employee johnDoe = new Employee(2, "John", "Doe");
	static Employee marySmith = new Employee(3, "Mary", "Smith");
	static Employee mikeWilson = new Employee(4, "Mike", "Wilson");
	
    public static void main(String[] args) {
    	//singlyLinkedList();

        doublyLinkedList();
    }
    
    private static void singlyLinkedList() {
    	SinglyLinkedList<Employee> list = new SinglyLinkedList<>();
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.print();

        Employee removed = list.removeFromFront();
        System.out.println(removed);

        System.out.println(list.getSize());
        list.print();
    }
    
    private static void doublyLinkedList() {
    	DoublyLinkedList<Employee> list = new DoublyLinkedList<Employee>();
    	System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.print();

        Employee removed = list.removeFromFront();
        System.out.println(removed);

        System.out.println(list.getSize());
        list.print();
    }
}
