package org.example;

import java.util.Arrays;

public class MyQueue <T> {
    private T [] arrayQueue;
    private int size;
    private int first;
    private int last;
    private static final int DEFAULT_SIZE = 10;
    public MyQueue(){
        this.arrayQueue = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
        this.first = 0;
        this.last = 0;
    }
    public void add(T value){
        if (size >= arrayQueue.length) {
            int newSize = arrayQueue.length + (arrayQueue.length / 2);
            arrayQueue = Arrays.copyOf(arrayQueue, newSize);
            size++;
        }
        arrayQueue[last] = value;
        last = (last + 1) % arrayQueue.length;
        size++;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return (T) arrayQueue[first];
    }

    public T poll() {
        if (size == 0) {
            return null;
        }
        T arryFirst = arrayQueue[first];
        arrayQueue[first] = null;
        first = (first + 1) % arrayQueue.length;
        size--;
        return arryFirst;
    }
    public void clear(){
        this.arrayQueue = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
        this.first = 0;
        this.last = 0;
    }
    public int getSize() {
        return size;
    }
}
