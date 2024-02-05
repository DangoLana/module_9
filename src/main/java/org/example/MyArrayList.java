package org.example;

import java.util.Arrays;

public class MyArrayList<T> {
    private T [] data;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public int getSize() {
        return size;
    }

    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(T input) {
        if (size >= data.length) {
            int newSize = data.length + (data.length / 2);
            data = Arrays.copyOf(data, newSize);
        }
        data[size] = input;
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return data[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        T[] destinationData = (T[]) new Object[data.length - 1];
        for (int i = 0, j = 0; i < data.length; i++) {
            if (i != index) {
                destinationData[j] = data[i];
                j++;
            }
        }
        data = destinationData;
        size--;
    }
    public void clear() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }
}

