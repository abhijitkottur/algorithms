package com.abhijit.linkedlist;

import com.abhijit.Employee;

public class LinkedListTest {

    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee marySmith = new Employee(3, "Mary", "Smith");
        Employee mikeWilson = new Employee(4, "Mike", "Wilson");

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
}
