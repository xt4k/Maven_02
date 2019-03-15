package com.telesens.academy.lesson09.home;

import java.util.Arrays;

public class GenArray<T> {
    private T[] array;
    private int lenght;

    public GenArray(T[] array) {
        this.array = array;
        this.lenght = array.length;
    }

    private boolean checkIndex(int i) {
        if (i >= this.lenght || i < 0) {
            new ArrayIndexOutOfBoundsException("wrong index for Array element", i);
            System.exit(1);
        }
        return true;
    }

    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void set(int index, T value) {
        checkIndex(index);
        array[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Arrays.equals(array, genArray.array);
    }

    public String getArray() {
        String arrAsStr = Arrays.toString(array);
        return arrAsStr;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}

