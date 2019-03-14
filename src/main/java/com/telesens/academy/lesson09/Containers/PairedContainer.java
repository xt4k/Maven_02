package com.telesens.academy.lesson09.Containers;

import java.lang.reflect.Array;

public class PairedContainer<T,V> {
    private T firstValue;
    private V secondValue;

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    @Override
    public String toString() {
        if (firstValue.getClass().isArray()&&secondValue.getClass().isArray())
        {
            Object[] fArray = (Object[]) firstValue;
            Object[] sArray = (Object[]) secondValue;
            return firstValue + "=>"+ secondValue;
        }

        return null;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }
}
