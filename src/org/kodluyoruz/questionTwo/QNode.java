package org.kodluyoruz.questionTwo;

public class QNode<E> {

    E element;
    QNode next;
    QNode prev;

    public QNode(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public QNode() {

    }
}
