package org.example;

import java.util.Objects;

public class MyLinkedList <T> {
    private Node <T> head;
    private Node <T> tail;
    private int size;

   private static class Node <T> {
       T value;
       Node <T> previous;
       Node <T> next;

       private Node(T value){
           this.value = value;
       }
   }
   public void add(T value) {
       Node <T> node = new Node <> (value);
       if(head == null) {
           head = node;
           tail = node;
       } else {
           node.previous = tail;
           tail.next = node;
           tail = node;
       }
       size++;
   }
   public T get(int index){
       Objects.checkIndex(index, size);
       Node<T> current = head;
       for(int i = 0; i < index; i++){
           current = current.next;
       }
       return current.value;
   }

    public int getSize() {
        return size;
    }
    public void remove(int index) {
        Objects.checkIndex(index, size);
        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head = head.next;
            head.previous = null;
        } else if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;

    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
