package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Пример использования
    public static void main(String[] args) {
        // Создание экземпляра списка
        MyLinkedList list = new MyLinkedList();

        // Добавление элементов в список
        list.add(10);
        list.add(20);
        list.add(30);

        // Вывод размера списка
        System.out.println("Размер списка: " + list.size());

        // Печать элементов списка
        list.printList();
    }
}