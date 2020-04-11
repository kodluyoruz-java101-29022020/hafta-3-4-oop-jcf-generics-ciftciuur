package org.kodluyoruz.questionTwo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tt = new LinkedList<>();
        tt.add("t");


        DoublyLinkedList<String> testLinked = new DoublyLinkedList<>();
        testLinked.addElement("Selim");
        testLinked.addElement("Mehmet");
        testLinked.writeListElements();
        System.out.println(testLinked.size());
        testLinked.removeElement("Mehmet");
        testLinked.writeListElements();
        System.out.println(testLinked.size());

    }
}
