package org.kodluyoruz.questionTwo;

public class QNode<E> {

    E element;
    QNode next;
    QNode prev;
    int index;

    public QNode(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public QNode(int index, E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
        this.index = index;
    }

    public QNode() {
        this.element = null;
        this.next = null;
        this.prev = null;
        this.index = 0;
    }
}
