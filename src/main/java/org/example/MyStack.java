package org.example;

import java.util.Arrays;
import java.util.Objects;

public class MyStack <T>{
        private T [] arrayStack;
        private int size;
        private int first;
        private int last;
        private static final int DEFAULT_SIZE = 10;
        public MyStack(){
            this.arrayStack = (T[]) new Object[DEFAULT_SIZE];
            this.size = 0;
            this.first = 0;
            this.last = 0;
        }
        public void push(T value){
            if (size >= arrayStack.length) {
                int newSize = arrayStack.length + (arrayStack.length / 2);
                arrayStack = Arrays.copyOf(arrayStack, newSize);
                size++;
            }
            arrayStack[last] = value;
            last = (last + 1) % arrayStack.length;
            size++;
        }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return arrayStack[last - 1];
    }

        public void clear(){
            this.arrayStack = (T[]) new Object[DEFAULT_SIZE];
            this.size = 0;
            this.first = 0;
            this.last = 0;
        }
        public int getSize() {
            return size;
        }

    public T pop() {
        if (size == 0) {
            return null;
        }
        last = (last - 1 + arrayStack.length) % arrayStack.length;
        T arryLast = arrayStack[last];
        arrayStack[last] = null;
        size--;
        return arryLast;
    }
    public void remove(int index){
        Objects.checkIndex(index, size);
        T[] destinationArray = (T[]) new Object[arrayStack.length - 1];
        for (int i = 0, j = 0; i < arrayStack.length; i++) {
            if (i != index) {
                destinationArray[j] = arrayStack[i];
                j++;
            }
        }
        arrayStack = destinationArray;
        size--;
    }
    }

