package org.kodluyoruz.questionTwo;

import java.util.LinkedList;

public class DoublyLinkedList<E> {
    private QNode<E> head;
    private QNode<E> tail;
    private int size;

    // TODO index mantıgı kurgulanabilir bunu sormakta fayda var 
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
    public void addElement(E element) {
        if (head == null)
            head = tail = new QNode<>(element);
        else if (head.element == element) {
            QNode tempNode = new QNode(element);
            tempNode.next = head;
            head.prev = tempNode;
            head = tempNode;
        } else if (tail.element == element) {
            QNode newNode = new QNode(element);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            QNode newNode = new QNode(element);
            QNode temp = head;
            while (temp.next != null && temp.element != element) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    /*
    Listenin elemanlarını ekrana yazdırır
     */
    public void writeListElements() {
        QNode temp = head;
        StringBuilder builder = new StringBuilder();
        while (temp != null) {
            builder.append("Element -> ");
            builder.append(temp.element);
            builder.append(" | ");
            System.out.print(builder.toString());
            temp = temp.next;
        }
        System.out.println();//tum kayıtları tek sırada listeledi bu kodda alt satıra ınmesi için
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
        } else {
            QNode tempNode = head;
            while (tempNode.next != null && tempNode.next.element != element) {
                tempNode = tempNode.next;
            }
            if (tempNode != null) {
                tempNode.next = tempNode.next.next;
                tempNode.prev = tempNode;
            }
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
