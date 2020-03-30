package org.kodluyoruz.questionTwo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tt = new LinkedList<>();
        tt.add("t");


        DoublyLinkedList<String> testLinked = new DoublyLinkedList<>();
        testLinked.addElement("Ahmet");
        testLinked.addElement("Mehmet");
        testLinked.addElement("Hüseyin");
        testLinked.writeListElements();
        System.out.println("Eleman sayısı :" + testLinked.size());
        testLinked.writeListElements();
        testLinked.removeElement("Ahmet");
        testLinked.writeListElements();

    }
}
