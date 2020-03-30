package org.kodluyoruz.questionTwo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tt = new LinkedList<>();
        tt.add("t");


        DoublyLinkedList<String> testLinked = new DoublyLinkedList<>();
        testLinked.addElement(0, "Ahmet");
        testLinked.addElement(1, "Mehmet");
        testLinked.addElement(2, "Hüseyin");
        testLinked.writeListElements();
        System.out.println("Eleman sayısı :" + testLinked.size());
        testLinked.writeListElements();
        testLinked.removeElement("Ahmet");
        System.out.println("Eleman sayısı :" + testLinked.size());
        testLinked.removeElementIndex(2);
        System.out.println("Eleman sayısı :" + testLinked.size());
        testLinked.writeListElements();

    }
}
