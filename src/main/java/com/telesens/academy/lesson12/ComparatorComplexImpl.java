package com.telesens.academy.lesson12;

import com.telesens.academy.lesson11.SubscriberExt;

import java.util.Comparator;

public class ComparatorComplexImpl implements Comparator<SubscriberExt> {

    @Override
    public int compare(SubscriberExt o1, SubscriberExt o2) {
        if ((o1.getOperator().getName()).equals(o2.getOperator().getName())) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else return o1.getOperator().getName().compareTo(o2.getOperator().getName());


    }
}
