package org.example;

public class MyLinkedList {
    private Node head;
    private int size;

    // Внутренний класс, представляющий узел списка
    private static class Node {
        int data;
        Node next;

        // Конструктор для создания нового узла
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Метод для добавления элемента в конец списка
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Метод для получения размера списка
    public int size() {
        return size;
    }

    // Метод для печати элементов списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}