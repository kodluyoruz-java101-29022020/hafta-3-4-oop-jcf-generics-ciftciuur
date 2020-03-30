package org.kodluyoruz.questionTwo;

import java.util.LinkedList;

public class DoublyLinkedList<E> {
    private QNode<E> head;
    private QNode<E> tail;
    private int size;

    public DoublyLinkedList() {
        //başlangıcta liste eleman sayısı 0
        this.size = 0;
    }

    /*
       listenin eleman sayısını bulur
     */
    public int size() {
        int listSize = 0;
        QNode tempNode = head;
        while (tempNode != null) {
            listSize++;
            tempNode = tempNode.next;
        }
        return listSize;
    }

    /*
        return empty status
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
    Listeye yeni eleman eklemesi yapar
     */
    public void addElement(int index, E element) {
        if (head == null)
            head = tail = new QNode<>(index, element);
        if (head.element == element) {
            QNode tempNode = new QNode(index, element);
            tempNode.next = head;
            head.prev = tempNode;
            head = tempNode;
        } else if (tail.element == element) {
            QNode newnode = new QNode(index, element);
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        } else {
            QNode newnode = new QNode(index, element);
            QNode temp = head;
            while (temp.next != null && temp.element != element) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next = newnode;
        }
    }

    /*
    Listenin elemanlarını ekrana yazdırır
     */
    public void writeListElements() {
        QNode temp = head;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /*
        Listeden eleman silme işlemini yapar
     */
    public void removeElement(E element) {
        //verilen eleman(string,int vs) head'da ise eger silip bir sonrakıne geçer
        if (head == null)
            head = tail = new QNode<>(element);
        if (head.element == element) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
        //verilen eleman(string,int vs) tail'de ise eger silip bir sonrakıne geçer
        else if (tail.element == element) {
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
        }
    }

    /*
       Listeden eleman silme işlemini yapar
    */
    public void removeElementIndex(int index) {
        //verilen eleman(string,int vs) head'da ise eger silip bir sonrakıne geçer
        if (head == null)
            head = tail = new QNode<>(index);
        if (head.index == index) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
        //verilen eleman(string,int vs) tail'de ise eger silip bir sonrakıne geçer
        else if (tail.index == index) {
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
        }
    }


    /*
        Liste içinde arama işlemi yapar
     */
    public boolean searchElement(E element) {
        QNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.element == element) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

}
