package com.array;

import java.lang.reflect.Array;

public class Arrays<T> {
    public static void main(String[] args) {
        Arrays<Integer> arr = new Arrays<>(Integer.class, 10);
    }
    private int size;
    private T[] elements;
    public Arrays(Class<T> type,int size)
    {
        this.elements = (T[]) Array.newInstance(type, size);
    }
    public void insert(int index,T data)
    {
        for(int i = elements.length;i > index;i--)
        {
            elements[i] = elements[i-1];
        }
    }
}
